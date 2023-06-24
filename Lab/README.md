# Lab

| S.N. | Topic                                                                                 | Date       | Status |
| :--: | :------------------------------------------------------------------------------------ | :--------- | :----- |
|  1.  | [Development of Hello World Application](#lab-1)                                      | 2023/04/11 | Done   |
|  2.  | [Implementation of working With multiple activities.](#lab-2)                         | 2023/04/16 | Done   |
|  3.  | [Implementation of Fragments.](#lab-3)                                                | 2023/04/28 | Done   |
|  4.  | [Implementation of Options Menu.](#lab-4)                                             | 2023/05/02 | Done   |
|  5.  | [Implementation of Context Menu.](#lab-5)                                             | 2023/05/09 | Done   |
|  6.  | [Implementation of Popup Menu.](#lab-6)                                               | 2023/05/12 | Done   |
|  7.  | [Implementation of Dialog Box.](#lab-7)                                               | 2023/05/16 | Done   |
|  8.  | [Implementation of ListView.](#lab-8)                                                 | 2023/05/30 | Done   |
|  9.  | [Implementation of GridView.](#lab-9)                                                 | 2023/06/02 | Done   |
| 10.  | [Implementation of RecyclerView.](#lab-10)                                            | 2023/06/06 | Done   |
| 11.  | [Create User Registration app which stores the information in the database.](#lab-11) | 2023/06/09 | Done   |

## Lab 1

### Source Code

MainActivity.java
```java
package com.mobileprogramming.helloworld;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
```

activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textSize="32sp"
        android:textStyle="bold"
        android:layout_centerInParent="true"/>
</RelativeLayout>
```

### Output

![Output](/Lab/images/0100.jpg)

[Go to Top](#lab)

[Main File](/Lab/HelloWorld/app/src/main/)

## Lab 2

### Source Code

MainActivity.java
```java
package com.mobileprogramming.multipleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}
```

SecondActivity.java
```java
package com.mobileprogramming.multipleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button btn_back;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_second);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(view -> {
            Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent2);
        });
    }
}
```

activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/tv_title1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="First Activity"
        android:textSize="32sp"
        android:textStyle="bold"/>

    <Button
        android:id="@+id/btn_next"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/tv_title1"
        android:layout_centerInParent="true"
        android:layout_margin="10dp"
        android:text="Next"/>
</RelativeLayout>
```

activity_second.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/tv_title2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="Second Activity"
        android:textSize="32sp"
        android:textStyle="bold"/>

    <Button
        android:id="@+id/btn_back"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:layout_below="@+id/tv_title2"
        android:layout_margin="10dp"
        android:text="Back" />
</RelativeLayout>
```

### Output

![Output1](/Lab/images/0201.jpg)
![Output2](/Lab/images/0202.jpg)

[Go to Top](#lab)

[Main File](/Lab/MultipleActivity/app/src/main/)

## Lab 3

### Source Code

MainActivity.java
```java
package com.mobileprogramming.fragmentdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
```

Fragment1.java
```java
package com.mobileprogramming.fragementdemo;

import android.os.Bundle;
import android.view.*;

import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment1, container, false);
        return view;
    }
}
```

Fragment2.java
```java
package com.mobileprogramming.fragmentdemo;

import android.os.Bundle;
import android.view.*;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment2, container, false);
        return view;
    }
}
```

activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <androidx.fragment.app.FragmentContainerView
        android:id="@+id/fragment1"
        android:name="com.mobileprogramming.fragmentdemo.Fragment1"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_weight="1"
        tools:layout="@layout/fragment_fragment1" />

    <androidx.fragment.app.FragmentContainerView
        android:id="@+id/fragment2"
        android:name="com.mobileprogramming.fragmentdemo.Fragment2"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:layout_below="@+id/fragment1"
        tools:layout="@layout/fragment_fragment2" />

</LinearLayout>
```

fragment_fragment1.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
             android:layout_width="match_parent"
             android:layout_height="match_parent">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Fragment 1"
        android:layout_centerInParent="true"
        android:textSize="32sp"
        android:textStyle="bold"/>
</RelativeLayout>
```

fragment_fragment2.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/black">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/fragment2"
        android:layout_centerInParent="true"
        android:textSize="32sp"
        android:textStyle="bold"
        android:textColor="@color/white"/>
</RelativeLayout>
```

### Output

![Output](/Lab/images/0300.jpg)

[Go to Top](#lab)

[Main File](/Lab/FragmentDemo/app/src/main/)

## Lab 4

### Source Code

MainActivity.java
```java
package com.mobileprogramming.optionsmenudemo;

import android.os.Bundle;
import android.view.*;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Toast.makeText(this, "Option 1 Clicked!", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.item2) {
            Toast.makeText(this, "Option 2 Clicked!", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
```

activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Options Menu Demo"
        android:textSize="32sp"
        android:textStyle="bold"
        android:layout_centerInParent="true"/>

</RelativeLayout>
```

menu_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item android:id="@+id/item1"
        android:title="Option 1"/>

    <item android:id="@+id/item2"
        android:title="Option 2"/>
</menu>
```

### Output

![Output](/Lab/images/0400.jpg)

[Go to Top](#lab)

[Main File](/Lab/OptionsMenuDemo/app/src/main/)

## Lab 5

### Source Code

MainActivity.java
```java
package com.mobileprogramming.contextmenudemo;

import android.os.Bundle;
import android.view.*;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tv_title;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_title = findViewById(R.id.tv_title);

        registerForContextMenu(tv_title);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, view, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.item1) {
            Toast.makeText(this, "Option 1 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.item2) {
            Toast.makeText(this, "Option 2 clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onContextItemSelected(item);
    }
}
```

activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/tv_title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Context Menu Demo"
        android:textSize="32sp"
        android:textStyle="bold"
        android:layout_centerInParent="true"/>
</RelativeLayout>
```

menu_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:id="@+id/item1"
        android:title="Item 1"/>

    <item android:id="@+id/item2"
        android:title="Item 2"/>
</menu>
```

### Output

![Output](/Lab/images/0500.jpg)

[Go to Top](#lab)

[Main File](/Lab/ContextMenuDemo/app/src/main/)

## Lab 6

### Source Code

MainActivity.java
```java
package com.mobileprogramming.popupmenudemo;

import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_menu = findViewById(R.id.btn_menu);
        btn_menu.setOnClickListener(view -> {
            PopupMenu popupMenu = new PopupMenu(this, view);

            popupMenu.getMenuInflater().inflate(R.menu.menu_main, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(item -> {
                int id = item.getItemId();

                if (id == R.id.item1) {
                    // Handle Option 1 click
                    Toast.makeText(MainActivity.this, "Option 1 clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.item2) {
                    // Handle Option 2 click
                    Toast.makeText(MainActivity.this, "Option 2 clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            });
            popupMenu.show();
        });
    }
}
```

activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <Button
        android:id="@+id/btn_menu"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/btn_menu"
        android:textSize="26sp"
        android:textStyle="bold"
        android:layout_centerInParent="true"
        android:padding="22sp"/>

</RelativeLayout>
```

menu_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:id="@+id/item1"
        android:title="@string/item1"/>

    <item android:id="@+id/item2"
        android:title="@string/item2"/>
</menu>
```

### Output

![Output](/Lab/images/0600.jpg)

[Go to Top](#lab)

[Main File](/Lab/PopupMenuDemo/app/src/main/)

## Lab 7

### Source Code

MainActivity.java
```java
package com.mobileprogramming.dialogboxdemo;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_dialog = findViewById(R.id.btn_dialog);
        btn_dialog.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Exit App")
                    .setMessage("Do you want to exit the App?")
                    .setPositiveButton("Yes", (dialogInterface, i) -> finish())
                    .setNegativeButton("No", (dialogInterface, i) -> dialogInterface.cancel());
            AlertDialog dialog = builder.create();
            dialog.show();
        });

    }
}
```

activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <Button
        android:id="@+id/btn_dialog"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/btn_dialog"
        android:textSize="32sp"
        android:textStyle="bold"
        android:layout_centerInParent="true"/>

</RelativeLayout>
```

### Output

![Output](/Lab/images/0700.jpg)

[Go to Top](#lab)

[Main File](/Lab/DialogBoxDemo/app/src/main/)

## Lab 8

### Source Code

MainActivity.java
```java
package com.mobileprogramming.listviewdemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list_view = findViewById(R.id.list_view);

        String names[] = {"Mobile Programming", "Distributed System", "Applied Economics", "Advanced Java Programming", "Network Programming"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.list_item, names);
        list_view.setAdapter(adapter);
    }
}
```

activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ListView
        android:id="@+id/list_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
</RelativeLayout>
```

activity_listview.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/list_item"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="16sp"
        android:textStyle="bold"
        android:padding="10sp"/>
</RelativeLayout>
```

![Output](/Lab/images/0800.jpg)

[Go to Top](#lab)

[Main File](/Lab/ListViewDemo/app/src/main/)

## Lab 9

### Source Code

MainActivity.java
```java
package com.mobileprogramming.gridviewdemo;

import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView view_grid = findViewById(R.id.view_grid);

        String[] names = {"Mobile Programming", "Distributed System", "Applied Economics", "Advanced Java Programming", "Network Programming"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_gridview, R.id.list_item, names);
        view_grid.setAdapter(adapter);
    }
}
```

activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <GridView
        android:id="@+id/view_grid"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:numColumns="2"/>
</RelativeLayout>
```

activity_gridview.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:id="@+id/list_item"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="24sp"
        android:textStyle="bold"
        android:layout_marginHorizontal="10dp"
        android:layout_marginVertical="20dp"/>
</RelativeLayout>
```

### Output

![Output](/Lab/images/0900.jpg)

[Go to Top](#lab)

[Main File](/Lab/GridViewDemo/app/src/main/)

## Lab 10

### Source Code

MainActivity.java
```java
package com.mobileprogramming.recyclerviewdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view_recycler = findViewById(R.id.view_recycler);

        String[] name = {"Mobile Programming", "Distributed System", "Applied Economics", "Advanced Java Programming", "Network Programming"};
        String[] description = {"Chhetra Sir", "Nabaraj Sir", "Santosh Sir", "Yubaraj Sir", "Khusbu Ma'am"};

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        view_recycler.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                LayoutInflater inflater = LayoutInflater.from(parent.getContext());
                View listItem = inflater.inflate(R.layout.activity_recyclerview, parent, false);
                return new MyViewHolder(listItem);
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                MyViewHolder myViewHolder = (MyViewHolder) holder;
                myViewHolder.tv_name.setText(name[position]);
                myViewHolder.tv_description.setText(description[position]);
            }

            @Override
            public int getItemCount() {
                return name.length;
            }
        };
        view_recycler.setAdapter(adapter);
    }

    private static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name, tv_description;

        MyViewHolder(View itemView){
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_description = itemView.findViewById(R.id.tv_description);
        }
    }
}
```

activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/view_recycler"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scrollbars="vertical"/>
</RelativeLayout>
```

activity_recyclerview.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <TextView
        android:id="@+id/tv_name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="32sp"
        android:textStyle="bold"
        android:paddingTop="20dp"
        android:paddingHorizontal="20dp"
        android:layout_marginHorizontal="20dp"
        android:layout_marginTop="10dp" />

    <TextView
        android:id="@+id/tv_description"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/tv_name"
        android:textSize="24sp"
        android:layout_marginHorizontal="20dp"
        android:paddingHorizontal="20dp"
        android:layout_marginBottom="10dp"/>
</RelativeLayout>
```

### Output

![Output](/Lab/images/1000.jpg)

[Go to Top](#lab)

[Main File](/Lab/RecyclerViewDemo/app/src/main/)

## Lab 11

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/UserRegister/app/src/main/)
