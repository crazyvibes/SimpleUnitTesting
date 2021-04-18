package in.bk.simpleunittesting.Repository;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;


public class RepositoryTest {


    @Spy
    Repository repository;

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();//help to run synchronously

    @Before
    public void setUp() throws Exception {
        //repository=Mockito.mock(Repository.class); //initializing for mock
        repository = Mockito.spy(Repository.class);//initializing for spy
    }

    @Test
    public void getData() {

        //with fake object
//        MutableLiveData<String> dummyLiveData=new MutableLiveData<>();
//        dummyLiveData.setValue("this is login test");
//        when(repository.getLiveData("Bk","123456")).thenReturn(dummyLiveData);//whenever we work with thenReturn we have to pass dummy data
//        System.out.println(dummyLiveData.getValue());

        //with real object
        doReturn(repository.getLiveData("Bkm", "123")).when(repository).getLiveData("Bkm", "123");
        System.out.println(repository.liveData.getValue());


        // when(repository.getData()).thenReturn("Hi this  is test.");//this is for mock, generating dummy return type
        //  doReturn(repository.getData()).when(repository).getData();//this is for spy, getting actual return type
        // System.out.println(repository.getData());
    }


    @Test
    public void getData2() {
        //for void return type
        //  doNothing().when(repository).getData2("Bk","123456");


    }

    @After
    public void tearDown() throws Exception {
    }
}