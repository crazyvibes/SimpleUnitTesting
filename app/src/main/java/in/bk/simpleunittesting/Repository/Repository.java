package in.bk.simpleunittesting.Repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

public class Repository {
    public MutableLiveData<String> liveData=new MutableLiveData<>();
    public String getData()
    {
        return "Hi this is BK.";
    }

    public void getData2(String name,String pass)
    {
        Log.d("TAG", "Name is "+name+". Password is "+pass);
    }

    public MutableLiveData<String> getLiveData(String name, String password) {
        liveData.setValue("name is "+name+" password is "+password);
        return liveData;
    }
}
