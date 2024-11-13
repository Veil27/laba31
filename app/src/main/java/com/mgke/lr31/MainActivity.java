package com.mgke.lr31;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация DrawerLayout и Toolbar
        drawerLayout = findViewById(R.id.drawer_layout);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Настройка ActionBarDrawerToggle для кнопки "гамбургера"
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Настройка слушателя для навигационной панели
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.nav_messages) {
                    // Открыть экран "Сообщения"
                } else if (id == R.id.nav_send_message) {
                    // Открыть экран "Отправить сообщение"
                } else if (id == R.id.nav_drafts) {
                    // Открыть экран "Черновики"
                } else if (id == R.id.nav_trash) {
                    // Открыть экран "Корзина"
                } else if (id == R.id.nav_help) {
                    // Открыть экран "Помощь"
                } else if (id == R.id.nav_feedback) {
                    // Открыть экран "Оставить отзыв"
                }

                drawerLayout.closeDrawers(); // Закрыть панель после выбора элемента
                return true;
            }
        });

    }
}