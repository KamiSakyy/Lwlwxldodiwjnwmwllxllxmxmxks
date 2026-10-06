package com.mailgram.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ApplicationProvider;

import com.mailgram.app.crypto.B64;
import com.mailgram.app.store.Msg;
import com.mailgram.app.store.Store;
import com.mailgram.app.sync.SyncEngine;
import com.mailgram.app.ui.ChatActivity;
import com.mailgram.app.ui.LockActivity;
import com.mailgram.app.ui.LoginActivity;
import com.mailgram.app.ui.MainActivity;
import com.mailgram.app.ui.SettingsActivity;
import com.mailgram.app.ui.SetupOauthActivity;
import com.mailgram.app.util.CrashLog;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;

import java.lang.reflect.Field;

/**
 * Живой прогон всех экранов на чистой JVM (Robolectric) — без эмулятора.
 * Каждый тест открывает экран так, как это делает человек, и заставляет
 * RecyclerView выполнить привязку строк. Любая пойманная «чёрным ящиком»
 * ошибка валит тест с точным стеком — причина падения видна в CI.
 */
@RunWith(RobolectricTestRunner.class)
@Config(sdk = 34)
public class SmokeTest {

    private Context ctx;

    @Before
    public void setUp() throws Exception {
        ctx = ApplicationProvider.getApplicationContext();
        SyncEngine.disabled = true; // интерфейс гоняем без сети
        clearStatic("com.mailgram.app.store.Store", "instance");
        clearStatic("com.mailgram.app.sync.SyncEngine", "instance");
        CrashLog.clear(ctx);
        ctx.getSharedPreferences("mailgram_settings", Context.MODE_PRIVATE).edit()
                .putBoolean("background_sync", false)
                .putBoolean("notifications", false)
                .commit();
    }

    @After
    public void assertNoCrash() {
        SyncEngine.disabled = false;
        String last = CrashLog.last(ctx);
        if (!last.isEmpty()) {
            fail("Экран поймал ошибку (см. стек):\n" + last);
        }
    }

    private static void clearStatic(String cls, String field) throws Exception {
        Field f = Class.forName(cls).getDeclaredField(field);
        f.setAccessible(true);
        f.set(null, null);
    }

    /** Вход выполнен: аккаунт + токены (в отладочной сборке — через тестовый шов). */
    private void seedSignIn() {
        ctx.getSharedPreferences("mailgram_auth", Context.MODE_PRIVATE).edit()
                .putString("account", "test@example.com")
                .putString("refresh_sealed", "testplain:" + B64.str(B64.utf8("refresh-token")))
                .putString("access_sealed", "testplain:" + B64.str(B64.utf8("access-token")))
                .putLong("expires_at", System.currentTimeMillis() + 3_600_000L)
                .commit();
    }

    private static void idle() {
        Shadows.shadowOf(Looper.getMainLooper()).idle();
    }

    /** Заставляет RecyclerView создать и привязать строки (как реальная раскладка). */
    private static void forceLayout(View v) {
        if (v == null) return;
        v.measure(View.MeasureSpec.makeMeasureSpec(1080, View.MeasureSpec.EXACTLY),
                View.MeasureSpec.makeMeasureSpec(1920, View.MeasureSpec.EXACTLY));
        v.layout(0, 0, 1080, 1920);
    }

    @Test
    public void loginScreenOpens() {
        Robolectric.buildActivity(LoginActivity.class).setup();
        idle();
    }

    @Test
    public void mainScreenSignedOut() {
        Robolectric.buildActivity(MainActivity.class).setup();
        idle();
    }

    @Test
    public void mainScreenSignedIn() {
        seedSignIn();
        MainActivity activity = Robolectric.buildActivity(MainActivity.class).setup().get();
        idle();
        forceLayout(activity.findViewById(R.id.recycler_chats));
        idle();
    }

    @Test
    public void mainScreenSignedInWithChats() {
        seedSignIn();
        Store store = Store.get(ctx);
        store.ensureChat("aabbccdd", "friend@example.com", "");
        Msg m = new Msg();
        m.mid = "m1";
        m.chat = "aabbccdd";
        m.peer = "friend@example.com";
        m.from = "friend@example.com";
        m.to = "test@example.com";
        m.ts = System.currentTimeMillis();
        m.text = "Привет, это проверка экрана";
        m.unread = true;
        store.put("aabbccdd", m);

        MainActivity activity = Robolectric.buildActivity(MainActivity.class).setup().get();
        idle();
        RecyclerView rv = activity.findViewById(R.id.recycler_chats);
        forceLayout(rv);
        idle();
        assertTrue("список чатов должен показать строку", rv != null && rv.getChildCount() > 0);
    }

    @Test
    public void chatScreenOpensWithMessages() {
        seedSignIn();
        Store store = Store.get(ctx);
        store.ensureChat("aabbccdd", "friend@example.com", "");
        Msg in = new Msg();
        in.mid = "m1";
        in.chat = "aabbccdd";
        in.peer = "friend@example.com";
        in.from = "friend@example.com";
        in.to = "test@example.com";
        in.ts = System.currentTimeMillis();
        in.text = "Привет, это проверка экрана";
        store.put("aabbccdd", in);
        Msg out = new Msg();
        out.mid = "m2";
        out.chat = "aabbccdd";
        out.peer = "friend@example.com";
        out.from = "test@example.com";
        out.to = "friend@example.com";
        out.ts = System.currentTimeMillis() + 1000;
        out.text = "Привет! Вижу сообщение https://example.com/path";
        out.outgoing = true;
        out.state = Msg.STATE_SENT;
        store.put("aabbccdd", out);

        Intent intent = new Intent(ctx, ChatActivity.class)
                .putExtra(ChatActivity.EXTRA_CHAT_UID, "aabbccdd");
        ChatActivity activity = Robolectric.buildActivity(ChatActivity.class, intent).setup().get();
        idle();
        RecyclerView rv = activity.findViewById(R.id.recycler_messages);
        forceLayout(rv);
        idle();
        assertTrue("список сообщений должен показать пузыри", rv != null && rv.getChildCount() > 0);
    }

    @Test
    public void settingsScreenOpens() {
        seedSignIn();
        Robolectric.buildActivity(SettingsActivity.class).setup();
        idle();
    }

    @Test
    public void lockScreenOpens() {
        Robolectric.buildActivity(LockActivity.class).setup();
        idle();
    }

    @Test
    public void setupOauthScreenOpens() {
        Robolectric.buildActivity(SetupOauthActivity.class).setup();
        idle();
    }
}
