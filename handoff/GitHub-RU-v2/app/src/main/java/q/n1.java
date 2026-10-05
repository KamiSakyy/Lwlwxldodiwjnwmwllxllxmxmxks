package q;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f30666a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
        }
        f30666a = field;
    }
}
