package p;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* loaded from: /home/user/work/p/classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30309a;

    /* renamed from: b, reason: collision with root package name */
    public final l f30310b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30311c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30312d;

    /* renamed from: e, reason: collision with root package name */
    public View f30313e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30315g;

    /* renamed from: h, reason: collision with root package name */
    public w f30316h;
    public t i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f30317j;

    /* renamed from: f, reason: collision with root package name */
    public int f30314f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final u f30318k = new u(this);

    public v(Context context, l lVar, View view, boolean z10, int i, int i10) {
        this.f30309a = context;
        this.f30310b = lVar;
        this.f30313e = view;
        this.f30311c = z10;
        this.f30312d = i;
    }

    public final t a() {
        t c0Var;
        if (this.i == null) {
            Context context = this.f30309a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new f(context, this.f30313e, this.f30312d, this.f30311c);
            } else {
                c0Var = new c0(this.f30309a, this.f30310b, this.f30313e, this.f30312d, this.f30311c);
            }
            c0Var.l(this.f30310b);
            c0Var.r(this.f30318k);
            c0Var.n(this.f30313e);
            c0Var.e(this.f30316h);
            c0Var.o(this.f30315g);
            c0Var.p(this.f30314f);
            this.i = c0Var;
        }
        return this.i;
    }

    public final boolean b() {
        t tVar = this.i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f30317j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i10, boolean z10, boolean z11) {
        t a10 = a();
        a10.s(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f30314f, this.f30313e.getLayoutDirection()) & 7) == 5) {
                i -= this.f30313e.getWidth();
            }
            a10.q(i);
            a10.t(i10);
            int i11 = (int) ((this.f30309a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f30307r = new Rect(i - i11, i10 - i11, i + i11, i10 + i11);
        }
        a10.g();
    }


}
