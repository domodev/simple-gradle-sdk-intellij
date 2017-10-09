package com.domo;

import com.domo.sdk.DomoClient;
import com.domo.sdk.request.Config;
import com.domo.sdk.request.Scope;
import com.domo.sdk.users.UserClient;
import com.domo.sdk.users.model.User;

import java.util.List;

public class Example {

  public static void main(String... arg) {
    //Note you can look up/create a id and secret at: https://developer.domo.com/manage-clients
    DomoClient client = DomoClient.create(Config.with().clientId("your client id")
                    .clientSecret("your secret")
                    .scope(Scope.USER)
                    .build()
            );
    UserClient userClient = client.userClient();

    List<User> list = userClient.list(20, 0);
    System.out.println(list.size());


  }

}
