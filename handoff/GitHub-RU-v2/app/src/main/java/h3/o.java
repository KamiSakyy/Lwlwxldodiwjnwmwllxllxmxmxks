package h3;

import android.text.Layout;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f25469a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f25470b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (k71.k.b(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (k71.k.b(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f25469a = alignment;
        f25470b = alignment2;
    }
}
