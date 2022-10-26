package pl.piomin.microservices.account.service;

import pl.piomin.microservices.account.model.Account;
import pl.piomin.microservices.account.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TodoServiceImpl is the service class that implements TodoService interface
 * In this service class data is fetched from database
 */
@Service
public class AccountService  {

    //Variable declarations

    //Autowired the JPA Repository
    @Autowired
    private AccountRepository accountRepository;


    /**
     * Method implementation for listing all the items of the To-do tasks
     * @return List of all To-do task objects
     */
    public List<Account> findAll() {
        List<Account> tasksList = accountRepository.findAll();
        return tasksList;
    }

    /**
     * Method implementation for fetching the single To-do task object, based on Id
     * @param id Unique identifier of the to-do task
     * @return Single To-do task object, based on Id
     */
    public Account findById(int id) {
        Account account = accountRepository.findOne(id); 
        return account;
    }

    /**
     * Method implementation for deleting an item from the To-do tasks based on Id
     * @param id Unique identifier of the to-do task to be deleted
     * @return True or False
     */
    public String deleteById(int id) {
    
            Account account = findById(id);
            accountRepository.delete(account);
            
        return "Deleted successfully";
    }


    public Account createOrUpdate(Account account) {
        account = accountRepository.save(account);
        return account;
    }

}
