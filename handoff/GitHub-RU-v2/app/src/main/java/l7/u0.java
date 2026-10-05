package l7;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/user/work/p/classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f28291b;

    public /* synthetic */ u0(w0 w0Var, int i) {
        this.f28290a = i;
        this.f28291b = w0Var;
    }

    public final int a(View view) {
        int D;
        int i;
        switch (this.f28290a) {
            case k5.f.J /* 0 */:
                x0 x0Var = (x0) view.getLayoutParams();
                D = w0.D(view);
                i = ((ViewGroup.MarginLayoutParams) x0Var).rightMargin;
                break;
            default:
                x0 x0Var2 = (x0) view.getLayoutParams();
                D = w0.y(view);
                i = ((ViewGroup.MarginLayoutParams) x0Var2).bottomMargin;
                break;
        }
        return D + i;
    }

    public final int b(View view) {
        int A;
        int i;
        switch (this.f28290a) {
            case k5.f.J /* 0 */:
                x0 x0Var = (x0) view.getLayoutParams();
                A = w0.A(view);
                i = ((ViewGroup.MarginLayoutParams) x0Var).leftMargin;
                break;
            default:
                x0 x0Var2 = (x0) view.getLayoutParams();
                A = w0.E(view);
                i = ((ViewGroup.MarginLayoutParams) x0Var2).topMargin;
                break;
        }
        return A - i;
    }

    public final int c() {
        int i;
        int I;
        switch (this.f28290a) {
            case k5.f.J /* 0 */:
                w0 w0Var = this.f28291b;
                i = w0Var.f28321n;
                I = w0Var.I();
                break;
            default:
                w0 w0Var2 = this.f28291b;
                i = w0Var2.f28322o;
                I = w0Var2.G();
                break;
        }
        return i - I;
    }

    public final int d() {
        switch (this.f28290a) {
            case k5.f.J /* 0 */:
                return this.f28291b.H();
            default:
                return this.f28291b.J();
        }
    }
}
