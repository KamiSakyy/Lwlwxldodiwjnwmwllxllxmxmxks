package f5;

import a5.c1;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.o;
import java.util.WeakHashMap;
import q.o1;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements View.OnTouchListener {
    public static final int I = ViewConfiguration.getTapTimeout();
    public final float[] A;
    public final float[] B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final o1 H;

    /* renamed from: r, reason: collision with root package name */
    public final a f24344r;

    /* renamed from: s, reason: collision with root package name */
    public final AccelerateInterpolator f24345s;

    /* renamed from: t, reason: collision with root package name */
    public final o1 f24346t;

    /* renamed from: u, reason: collision with root package name */
    public o f24347u;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f24348v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f24349w;

    /* renamed from: x, reason: collision with root package name */
    public final int f24350x;

    /* renamed from: y, reason: collision with root package name */
    public final int f24351y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f24352z;

    public d(o1 o1Var) {
        a aVar = new a();
        aVar.f24340e = Long.MIN_VALUE;
        aVar.f24342g = -1L;
        aVar.f24341f = 0L;
        this.f24344r = aVar;
        this.f24345s = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f24348v = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f24349w = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f24352z = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.A = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.B = fArr5;
        this.f24346t = o1Var;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f6) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f6 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.f24350x = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f24351y = I;
        aVar.f24336a = 500;
        aVar.f24337b = 500;
        this.H = o1Var;
    }

    public static float b(float f6, float f10, float f11) {
        return f6 > f11 ? f11 : f6 < f10 ? f10 : f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f6, float f10, float f11) {
        float f12;
        float interpolation;
        float b10 = b(this.f24348v[i] * f10, 0.0f, this.f24349w[i]);
        float c10 = c(f10 - f6, b10) - c(f6, b10);
        AccelerateInterpolator accelerateInterpolator = this.f24345s;
        if (c10 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c10);
        } else {
            if (c10 <= 0.0f) {
                f12 = 0.0f;
                if (f12 != 0.0f) {
                    return 0.0f;
                }
                float f13 = this.f24352z[i];
                float f14 = this.A[i];
                float f15 = this.B[i];
                float f16 = f13 * f11;
                return f12 > 0.0f ? b(f12 * f16, f14, f15) : -b((-f12) * f16, f14, f15);
            }
            interpolation = accelerateInterpolator.getInterpolation(c10);
        }
        f12 = b(interpolation, -1.0f, 1.0f);
        if (f12 != 0.0f) {
        }
    }

    public final float c(float f6, float f10) {
        if (f10 != 0.0f) {
            int i = this.f24350x;
            if (i == 0 || i == 1) {
                if (f6 < f10) {
                    if (f6 >= 0.0f) {
                        return 1.0f - (f6 / f10);
                    }
                    if (this.F && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f6 < 0.0f) {
                return f6 / (-f10);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.D) {
            this.F = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f24344r;
        int i10 = (int) (currentAnimationTimeMillis - aVar.f24340e);
        int i11 = aVar.f24337b;
        if (i10 > i11) {
            i = i11;
        } else if (i10 >= 0) {
            i = i10;
        }
        aVar.i = i;
        aVar.f24343h = aVar.a(currentAnimationTimeMillis);
        aVar.f24342g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        o1 o1Var;
        int count;
        a aVar = this.f24344r;
        float f6 = aVar.f24339d;
        int abs = (int) (f6 / Math.abs(f6));
        Math.abs(aVar.f24338c);
        if (abs != 0 && (count = (o1Var = this.H).getCount()) != 0) {
            int childCount = o1Var.getChildCount();
            int firstVisiblePosition = o1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && o1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && o1Var.getChildAt(childCount - 1).getBottom() <= o1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.G) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.E = true;
            this.C = false;
            float x2 = motionEvent.getX();
            float width = view.getWidth();
            o1 o1Var = this.f24346t;
            float a10 = a(0, x2, width, o1Var.getWidth());
            float a11 = a(1, motionEvent.getY(), view.getHeight(), o1Var.getHeight());
            a aVar = this.f24344r;
            aVar.f24338c = a10;
            aVar.f24339d = a11;
            if (!this.F && e()) {
                if (this.f24347u == null) {
                    this.f24347u = new o(19, this);
                }
                this.F = true;
                this.D = true;
                if (this.C || (i = this.f24351y) <= 0) {
                    this.f24347u.run();
                } else {
                    o oVar = this.f24347u;
                    long j10 = i;
                    WeakHashMap weakHashMap = c1.f374a;
                    o1Var.postOnAnimationDelayed(oVar, j10);
                }
                this.C = true;
            }
        }
        return false;
    }
}
