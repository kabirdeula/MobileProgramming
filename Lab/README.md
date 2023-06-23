# Lab

| S.N. | Topic                                                                      | Date       | Status |
| :--: | :------------------------------------------------------------------------- | :--------- | :----- |
|  1.  | [Development of Hello World Application](#lab-1)                           | 2023/04/11 | ToDo   |
|  2.  | [Implementation of working With multiple activities.](#lab-2)              | 2023/04/16 | ToDo   |
|  3.  | [Implementation of Fragments.](#lab-3)                                     | 2023/04/28 | ToDo   |
|  4.  | [Implementation of Options Menu.](#lab-4)                                  | 2023/05/02 | ToDo   |
|  5.  | Implementation of Context Menu                                             | 2023/05/09 | ToDo   |
|  6.  | Implementation of Popup Menu                                               | 2023/05/12 | ToDo   |
|  7.  | Implementation of Dialog Box                                               | 2023/05/16 | ToDo   |
|  8.  | Implementation of ListView                                                 | 2023/05/30 | ToDo   |
|  9.  | Implementation of GridView                                                 | 2023/06/02 | ToDo   |
| 10.  | Implementation of RecyclerView                                             | 2023/06/06 | ToDo   |
| 11.  | Create User Registration app which stores the information in the database. | 2023/06/09 | ToDo   |

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
        android:text="@string/title"
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
        android:title="@string/item1"/>

    <item android:id="@+id/item2"
        android:title="@string/item2"/>
</menu>
```

### Output

![Output](/Lab/images/0400.jpg)

[Go to Top](#lab)

[Main File](/Lab/OptionsMenuDemo/app/src/main/)

## Lab 5

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 6

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 7

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 8

### Source Code

```java

```

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 9

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 10

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 11

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 12

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 13

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 14

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 15

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 16

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 17

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 18

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 19

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 20

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)
