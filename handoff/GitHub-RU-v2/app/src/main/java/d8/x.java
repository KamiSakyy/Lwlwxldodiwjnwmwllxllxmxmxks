package d8;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import b6.a2;

/* loaded from: /home/user/work/p/classes.dex */
public class x extends y9.a {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f21665e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f21666f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f21667g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f21668h = true;

    @Override // y9.a
    public void B(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.B(view, i);
        } else if (f21668h) {
            try {
                a2.l(view, i);
            } catch (NoSuchMethodError unused) {
                f21668h = false;
            }
        }
    }

    public void R(View view, int i, int i10, int i11, int i12) {
        if (f21667g) {
            try {
                a2.j(view, i, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f21667g = false;
            }
        }
    }

    public void S(View view, Matrix matrix) {
        if (f21665e) {
            try {
                a2.q(view, matrix);
            } catch (NoSuchMethodError unused) {
                f21665e = false;
            }
        }
    }

    public void T(View view, Matrix matrix) {
        if (f21666f) {
            try {
                a2.r(view, matrix);
            } catch (NoSuchMethodError unused) {
                f21666f = false;
            }
        }
    }
}
