package in.bk.simpleunittesting.Repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


public class RepositoryTest {

    @Mock
    Repository repository;

    @Before
    public void setUp() throws Exception {
        repository=Mockito.mock(Repository.class);
    }

    @Test
    public void getData(){

        when(repository.getData()).thenReturn("Hi this  is test.");
        System.out.println(repository.getData());
    }


    @After
    public void tearDown() throws Exception {
    }
}