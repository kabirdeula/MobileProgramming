# Lab

| S.N. | Topic                                                                      | Date       | Status |
| :--: | :------------------------------------------------------------------------- | :--------- | :----- |
|  1.  | [Development of Hello World Application](#lab-1)                           | 2023/04/11 | ToDo   |
|  2.  | [Implementation of working With multiple activities.](#lab-2)              | 2023/04/16 | ToDo   |
|  3.  | Implementation of Fragments                                                | 2023/04/28 | ToDo   |
|  4.  | Implementation of Options Menu                                             | 2023/05/02 | ToDo   |
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

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

## Lab 4

### Source Code

```java

```

### Output

[Go to Top](#lab)

[Main File](/Lab/)

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
