package l7;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/user/work/p/classes.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public int f28097a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f28098b;

    /* renamed from: c, reason: collision with root package name */
    public w0 f28099c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28100d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28101e;

    /* renamed from: f, reason: collision with root package name */
    public View f28102f;

    /* renamed from: g, reason: collision with root package name */
    public h1 f28103g;

    /* renamed from: h, reason: collision with root package name */
    public LinearInterpolator f28104h;
    public DecelerateInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f28105j;

    /* renamed from: k, reason: collision with root package name */
    public DisplayMetrics f28106k;
    public boolean l;
    public float m;

    /* renamed from: n, reason: collision with root package name */
    public int f28107n;

    /* renamed from: o, reason: collision with root package name */
    public int f28108o;

    public e0(Context context) {
        h1 h1Var = new h1();
        h1Var.f28145d = -1;
        h1Var.f28147f = false;
        h1Var.f28142a = 0;
        h1Var.f28143b = 0;
        h1Var.f28144c = Integer.MIN_VALUE;
        h1Var.f28146e = null;
        this.f28103g = h1Var;
        this.f28104h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.l = false;
        this.f28107n = 0;
        this.f28108o = 0;
        this.f28106k = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    public int b(View view, int i) {
        w0 w0Var = this.f28099c;
        if (w0Var == null || !w0Var.d()) {
            return 0;
        }
        x0 x0Var = (x0) view.getLayoutParams();
        return a(w0.A(view) - ((ViewGroup.MarginLayoutParams) x0Var).leftMargin, w0.D(view) + ((ViewGroup.MarginLayoutParams) x0Var).rightMargin, w0Var.H(), w0Var.f28321n - w0Var.I(), i);
    }

    public int c(View view, int i) {
        w0 w0Var = this.f28099c;
        if (w0Var == null || !w0Var.e()) {
            return 0;
        }
        x0 x0Var = (x0) view.getLayoutParams();
        return a(w0.E(view) - ((ViewGroup.MarginLayoutParams) x0Var).topMargin, w0.y(view) + ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin, w0Var.J(), w0Var.f28322o - w0Var.G(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.l) {
            this.m = d(this.f28106k);
            this.l = true;
        }
        return (int) Math.ceil(abs * this.m);
    }

    public PointF f(int i) {
        Object obj = this.f28099c;
        if (obj instanceof i1) {
            return ((i1) obj).a(i);
        }
        return null;
    }

    public int g() {
        PointF pointF = this.f28105j;
        if (pointF == null) {
            return 0;
        }
        float f6 = pointF.y;
        if (f6 == 0.0f) {
            return 0;
        }
        return f6 > 0.0f ? 1 : -1;
    }

    public final void h(int i, int i10) {
        PointF f6;
        RecyclerView recyclerView_r7 = this.f28098b;
        if (this.f28097a == -1 || recyclerView_r7 == null) {
            j();
        }
        if (this.f28100d && this.f28102f == null && this.f28099c != null && (f6 = f(this.f28097a)) != null) {
            float f10 = f6.x;
            if (f10 != 0.0f || f6.y != 0.0f) {
                recyclerView_r7.k0((int) Math.signum(f10), (int) Math.signum(f6.y), null);
            }
        }
        this.f28100d = false;
        View view = this.f28102f;
        h1 h1Var = this.f28103g;
        if (view != null) {
            this.f28098b.getClass();
            n1 P = RecyclerView.P(view);
            if ((P != null ? P.j() : -1) == this.f28097a) {
                View view2 = this.f28102f;
                j1 j1Var = recyclerView_r7.f3080y0;
                i(view2, h1Var);
                h1Var.a(recyclerView_r7);
                j();
            } else {
                this.f28102f = null;
            }
        }
        if (this.f28101e) {
            j1 j1Var2 = recyclerView_r7.f3080y0;
            if (this.f28098b.E.v() == 0) {
                j();
            } else {
                int i11 = this.f28107n;
                int i12 = i11 - i;
                if (i11 * i12 <= 0) {
                    i12 = 0;
                }
                this.f28107n = i12;
                int i13 = this.f28108o;
                int i14 = i13 - i10;
                if (i13 * i14 <= 0) {
                    i14 = 0;
                }
                this.f28108o = i14;
                if (i12 == 0 && i14 == 0) {
                    PointF f11 = f(this.f28097a);
                    if (f11 != null) {
                        if (f11.x != 0.0f || f11.y != 0.0f) {
                            float f12 = f11.y;
                            float sqrt = (float) Math.sqrt((f12 * f12) + (r10 * r10));
                            float f13 = f11.x / sqrt;
                            f11.x = f13;
                            float f14 = f11.y / sqrt;
                            f11.y = f14;
                            this.f28105j = f11;
                            this.f28107n = (int) (f13 * 10000.0f);
                            this.f28108o = (int) (f14 * 10000.0f);
                            int e5 = e(10000);
                            h1Var.f28142a = (int) (this.f28107n * 1.2f);
                            h1Var.f28143b = (int) (this.f28108o * 1.2f);
                            h1Var.f28144c = (int) (e5 * 1.2f);
                            h1Var.f28146e = this.f28104h;
                            h1Var.f28147f = true;
                        }
                    }
                    h1Var.f28145d = this.f28097a;
                    j();
                }
            }
            boolean z10 = h1Var.f28145d >= 0;
            h1Var.a(recyclerView_r7);
            if (z10 && this.f28101e) {
                this.f28100d = true;
                recyclerView_r7.f3074v0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(View view, h1 h1Var) {
        int i;
        int ceil;
        PointF pointF = this.f28105j;
        if (pointF != null) {
            float f6 = pointF.x;
            if (f6 != 0.0f) {
                i = f6 > 0.0f ? 1 : -1;
                int b10 = b(view, i);
                int c10 = c(view, g());
                ceil = (int) Math.ceil(e((int) Math.sqrt((c10 * c10) + (b10 * b10))) / 0.3356d);
                if (ceil <= 0) {
                    h1Var.f28142a = -b10;
                    h1Var.f28143b = -c10;
                    h1Var.f28144c = ceil;
                    h1Var.f28146e = this.i;
                    h1Var.f28147f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b102 = b(view, i);
        int c102 = c(view, g());
        ceil = (int) Math.ceil(e((int) Math.sqrt((c102 * c102) + (b102 * b102))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void j() {
        if (this.f28101e) {
            this.f28101e = false;
            this.f28108o = 0;
            this.f28107n = 0;
            this.f28105j = null;
            this.f28098b.f3080y0.f28164a = -1;
            this.f28102f = null;
            this.f28097a = -1;
            this.f28100d = false;
            w0 w0Var = this.f28099c;
            if (w0Var.f28315e == this) {
                w0Var.f28315e = null;
            }
            this.f28099c = null;
            this.f28098b = null;
        }
    }
















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class RecyclerView {
        public RecyclerView() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class h1 {
        public h1() {
        }
    }
}
