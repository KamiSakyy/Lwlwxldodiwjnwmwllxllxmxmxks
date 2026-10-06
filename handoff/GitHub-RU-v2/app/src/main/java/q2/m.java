package q2;

import android.os.Build;
import android.view.MotionEvent;
import com.google.android.gms.internal.measurement.h4;
import java.util.List;
import l7.x1;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30873a;

    /* renamed from: b, reason: collision with root package name */
    public final h4 f30874b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30875c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30876d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30877e;

    /* renamed from: f, reason: collision with root package name */
    public int f30878f;

    public m(List list, h4 h4Var) {
        MotionEvent a10;
        this.f30873a = list;
        this.f30874b = h4Var;
        int i = 0;
        this.f30875c = (Build.VERSION.SDK_INT < 29 || (a10 = a()) == null) ? 0 : a10.getClassification();
        MotionEvent a11 = a();
        this.f30876d = a11 != null ? a11.getButtonState() : 0;
        MotionEvent a12 = a();
        this.f30877e = a12 != null ? a12.getMetaState() : 0;
        MotionEvent a13 = a();
        if (a13 != null) {
            int actionMasked = a13.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    }
                    i = 3;
                }
                i = 2;
            }
            i = 1;
        } else {
            int size = list.size();
            while (i < size) {
                u uVar = (u) list.get(i);
                if (t.d(uVar)) {
                    i = 2;
                } else if (t.b(uVar)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.f30878f = i;
    }

    public final MotionEvent a() {
        h4 h4Var = this.f30874b;
        if (h4Var != null) {
            return (MotionEvent) ((x1) h4Var.c).f28355s;
        }
        return null;
    }
}
