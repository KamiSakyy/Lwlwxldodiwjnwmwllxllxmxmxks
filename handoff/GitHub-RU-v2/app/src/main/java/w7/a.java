package w7;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.sqlite.db.framework.h;
import java.io.Closeable;

/* loaded from: /home/user/work/p/classes.dex */
public interface a extends Closeable {
    h D(String str);

    int D0(ContentValues contentValues, Object[] objArr);

    void J();

    boolean Q();

    void S(Object[] objArr);

    void T();

    void V();

    boolean i();

    boolean isOpen();

    void j0();

    Cursor m0(s21.a aVar);

    void o();

    boolean t0();

    void w();

    void x(String str);
}
