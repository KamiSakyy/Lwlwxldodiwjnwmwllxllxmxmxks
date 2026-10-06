package es.voghdev.pdfviewpager.library.subscaleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import c21.f0;
import es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaImageDecoder;
import es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaImageRegionDecoder;
import f1.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s61.d;
import s61.f;
import s61.g;
import s61.h;
import s61.j;
import s61.k;
import s61.l;
import s61.m;
import s61.n;
import t61.a;
import t61.b;
import t61.c;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public class SubsamplingScaleImageView extends View {
    public static Bitmap.Config F0;
    public int A;
    public Matrix A0;
    public int B;
    public RectF B0;
    public int C;
    public final float[] C0;
    public int D;
    public final float[] D0;
    public Executor E;
    public final float E0;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public float M;
    public float N;
    public PointF O;
    public PointF P;
    public PointF Q;
    public Float R;
    public PointF S;
    public PointF T;
    public int U;
    public int V;
    public int W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public GestureDetector e0;
    public GestureDetector f0;
    public c g0;
    public final ReentrantReadWriteLock h0;
    public b i0;
    public b j0;
    public PointF k0;
    public float l0;
    public final float m0;
    public float n0;
    public boolean o0;
    public PointF p0;
    public PointF q0;
    public Bitmap r;
    public PointF r0;
    public boolean s;
    public g s0;
    public Uri t;
    public boolean t0;
    public int u;
    public boolean u0;
    public LinkedHashMap v;
    public View.OnLongClickListener v0;
    public int w;
    public final Handler w0;
    public float x;
    public Paint x0;
    public float y;
    public Paint y0;
    public int z;
    public j z0;

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        this.w = 0;
        this.x = 2.0f;
        this.y = p();
        this.z = -1;
        this.A = 1;
        this.B = 1;
        this.C = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.E = AsyncTask.THREAD_POOL_EXECUTOR;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = 1.0f;
        this.K = 1;
        this.L = 500;
        this.h0 = new ReentrantReadWriteLock(true);
        this.i0 = new a(SkiaImageDecoder.class);
        this.j0 = new a(SkiaImageRegionDecoder.class);
        this.C0 = new float[8];
        this.D0 = new float[8];
        this.E0 = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.w0 = new Handler(new f0(1, this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q61.b.a);
            if (obtainStyledAttributes.hasValue(0) && (string = obtainStyledAttributes.getString(0)) != null && string.length() > 0) {
                String concat = "file:///android_asset/".concat(string);
                if (concat == null) {
                    throw new NullPointerException("Uri must not be null");
                }
                if (!concat.contains("://")) {
                    concat = e.g("file:///", concat.startsWith("/") ? concat.substring(1) : concat);
                }
                s61.a aVar = new s61.a(Uri.parse(concat));
                aVar.d = true;
                setImage(aVar);
            }
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
                s61.a aVar2 = new s61.a(resourceId);
                aVar2.d = true;
                setImage(aVar2);
            }
            if (obtainStyledAttributes.hasValue(1)) {
                setPanEnabled(obtainStyledAttributes.getBoolean(1, true));
            }
            if (obtainStyledAttributes.hasValue(5)) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(5, true));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                setQuickScaleEnabled(obtainStyledAttributes.getBoolean(2, true));
            }
            if (obtainStyledAttributes.hasValue(4)) {
                setTileBackgroundColor(obtainStyledAttributes.getColor(4, Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.m0 = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r8 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r8 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(SubsamplingScaleImageView subsamplingScaleImageView, Context context, String str) {
        int i = 0;
        if (str.startsWith("content")) {
            Cursor cursor = null;
            try {
                try {
                    cursor = context.getContentResolver().query(Uri.parse(str), new String[]{"orientation"}, null, null, null);
                    if (cursor != null && cursor.moveToFirst()) {
                        int i2 = cursor.getInt(0);
                        if (n.a.contains(Integer.valueOf(i2)) && i2 != -1) {
                            i = i2;
                        }
                    }
                } catch (Exception unused) {
                    List list = n.a;
                }
            } finally {
            }
        } else if (str.startsWith("file:///") && !str.startsWith("file:///android_asset/")) {
            try {
                int attributeInt = new ExifInterface(str.substring(7)).getAttributeInt("Orientation", 1);
                if (attributeInt != 1 && attributeInt != 0) {
                    if (attributeInt == 6) {
                        return 90;
                    }
                    if (attributeInt == 3) {
                        return 180;
                    }
                    if (attributeInt == 8) {
                        return 270;
                    }
                    List list2 = n.a;
                }
                return 0;
            } catch (Exception unused2) {
                List list3 = n.a;
            }
        }
        return i;
    }

    public static void e(SubsamplingScaleImageView subsamplingScaleImageView, Rect rect, Rect rect2) {
        if (subsamplingScaleImageView.getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (subsamplingScaleImageView.getRequiredRotation() == 90) {
            int i = rect.top;
            int i2 = subsamplingScaleImageView.V;
            rect2.set(i, i2 - rect.right, rect.bottom, i2 - rect.left);
        } else if (subsamplingScaleImageView.getRequiredRotation() != 180) {
            int i3 = subsamplingScaleImageView.U;
            rect2.set(i3 - rect.bottom, rect.left, i3 - rect.top, rect.right);
        } else {
            int i4 = subsamplingScaleImageView.U;
            int i5 = i4 - rect.right;
            int i6 = subsamplingScaleImageView.V;
            rect2.set(i5, i6 - rect.bottom, i4 - rect.left, i6 - rect.top);
        }
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return F0;
    }

    private int getRequiredRotation() {
        int i = this.w;
        return i == -1 ? this.W : i;
    }

    public static float j(int i, long j, float f, float f2, long j2) {
        float f3;
        if (i == 1) {
            float f4 = j / j2;
            return i.a(f4, 2.0f, (-f2) * f4, f);
        }
        if (i != 2) {
            throw new IllegalStateException(no.a.k("Unexpected easing type: ", i));
        }
        float f5 = j / (j2 / 2.0f);
        if (f5 < 1.0f) {
            f3 = (f2 / 2.0f) * f5 * f5;
        } else {
            float f6 = f5 - 1.0f;
            f3 = (((f6 - 2.0f) * f6) - 1.0f) * ((-f2) / 2.0f);
        }
        return f3 + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.e0 = new GestureDetector(context, new s61.e(this, context));
        this.f0 = new GestureDetector(context, new f(this));
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        F0 = config;
    }

    public static void w(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    public final int f(float f) {
        int round;
        if (this.z > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= this.z / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int v = (int) (v() * f);
        int u = (int) (u() * f);
        if (v == 0 || u == 0) {
            return 32;
        }
        int i = 1;
        if (u() > u || v() > v) {
            round = Math.round(u() / u);
            int round2 = Math.round(v() / v);
            if (round >= round2) {
                round = round2;
            }
        } else {
            round = 1;
        }
        while (true) {
            int i2 = i * 2;
            if (i2 >= round) {
                return i;
            }
            i = i2;
        }
    }

    public final boolean g() {
        boolean o = o();
        if (!this.u0 && o) {
            r();
            this.u0 = true;
        }
        return o;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final PointF getCenter() {
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        PointF pointF = new PointF();
        PointF pointF2 = this.O;
        if (pointF2 == null) {
            return null;
        }
        float f = width - pointF2.x;
        float f2 = this.M;
        pointF.set(f / f2, (height - pointF2.y) / f2);
        return pointF;
    }

    public float getMaxScale() {
        return this.x;
    }

    public final float getMinScale() {
        return p();
    }

    public final int getOrientation() {
        return this.w;
    }

    public final int getSHeight() {
        return this.V;
    }

    public final int getSWidth() {
        return this.U;
    }

    public final float getScale() {
        return this.M;
    }

    public final s61.b getState() {
        if (this.O == null || this.U <= 0 || this.V <= 0) {
            return null;
        }
        getScale();
        PointF center = getCenter();
        getOrientation();
        s61.b bVar = new s61.b();
        float f = center.x;
        return bVar;
    }

    public final boolean h() {
        boolean z = getWidth() > 0 && getHeight() > 0 && this.U > 0 && this.V > 0 && (this.r != null || o());
        if (!this.t0 && z) {
            r();
            this.t0 = true;
        }
        return z;
    }

    public final void i(PointF pointF, PointF pointF2) {
        if (!this.G) {
            PointF pointF3 = this.T;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = v() / 2;
                pointF.y = u() / 2;
            }
        }
        float min = Math.min(this.x, this.J);
        float f = this.M;
        boolean z = ((double) f) <= ((double) min) * 0.9d || f == this.y;
        if (!z) {
            min = p();
        }
        int i = this.K;
        if (i == 3) {
            this.s0 = null;
            this.R = Float.valueOf(min);
            this.S = pointF;
            this.T = pointF;
            invalidate();
        } else if (i == 2 || !z || !this.G) {
            h hVar = new h(this, min, pointF);
            hVar.g = false;
            hVar.d = this.L;
            hVar.f = 4;
            hVar.a();
        } else if (i == 1) {
            h hVar2 = new h(this, min, pointF, pointF2);
            hVar2.g = false;
            hVar2.d = this.L;
            hVar2.f = 4;
            hVar2.a();
        }
        invalidate();
    }

    public final void k(boolean z) {
        boolean z2;
        if (this.O == null) {
            this.O = new PointF(0.0f, 0.0f);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.z0 == null) {
            this.z0 = new j(0.0f, new PointF(0.0f, 0.0f));
        }
        j jVar = this.z0;
        jVar.a = this.M;
        jVar.b.set(this.O);
        l(z, this.z0);
        j jVar2 = this.z0;
        this.M = jVar2.a;
        this.O.set(jVar2.b);
        if (!z2 || this.B == 4) {
            return;
        }
        this.O.set(z(v() / 2, u() / 2, this.M));
    }

    public final void l(boolean z, j jVar) {
        float paddingLeft;
        float max;
        int max2;
        float max3;
        if (this.A == 2 && this.t0) {
            z = false;
        }
        PointF pointF = jVar.b;
        float min = Math.min(this.x, Math.max(p(), jVar.a));
        float v = v() * min;
        float u = u() * min;
        if (this.A == 3 && this.t0) {
            pointF.x = Math.max(pointF.x, (getWidth() / 2) - v);
            pointF.y = Math.max(pointF.y, (getHeight() / 2) - u);
        } else if (z) {
            pointF.x = Math.max(pointF.x, getWidth() - v);
            pointF.y = Math.max(pointF.y, getHeight() - u);
        } else {
            pointF.x = Math.max(pointF.x, -v);
            pointF.y = Math.max(pointF.y, -u);
        }
        float f = 0.5f;
        if (getPaddingLeft() > 0 || getPaddingRight() > 0) {
            paddingLeft = getPaddingLeft() / (getPaddingRight() + getPaddingLeft());
        } else {
            paddingLeft = 0.5f;
        }
        if (getPaddingTop() > 0 || getPaddingBottom() > 0) {
            f = getPaddingTop() / (getPaddingBottom() + getPaddingTop());
        }
        if (this.A == 3 && this.t0) {
            max = Math.max(0, getWidth() / 2);
            max2 = Math.max(0, getHeight() / 2);
        } else {
            if (z) {
                max = Math.max(0.0f, (getWidth() - v) * paddingLeft);
                max3 = Math.max(0.0f, (getHeight() - u) * f);
                pointF.x = Math.min(pointF.x, max);
                pointF.y = Math.min(pointF.y, max3);
                jVar.a = min;
            }
            max = Math.max(0, getWidth());
            max2 = Math.max(0, getHeight());
        }
        max3 = max2;
        pointF.x = Math.min(pointF.x, max);
        pointF.y = Math.min(pointF.y, max3);
        jVar.a = min;
    }

    public final synchronized void m(Point point) {
        Throwable th;
        try {
            try {
                j jVar = new j(0.0f, new PointF(0.0f, 0.0f));
                this.z0 = jVar;
                l(true, jVar);
                int f = f(this.z0.a);
                this.u = f;
                if (f > 1) {
                    try {
                        this.u = f / 2;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (this.u != 1 || v() >= point.x || u() >= point.y) {
                    n(point);
                    Iterator it = ((List) this.v.get(Integer.valueOf(this.u))).iterator();
                    while (it.hasNext()) {
                        new l(this, this.g0, (k) it.next()).executeOnExecutor(this.E, new Void[0]);
                    }
                    s(true);
                } else {
                    this.g0.b();
                    this.g0 = null;
                    new s61.i(this, getContext(), this.i0, this.t, false).executeOnExecutor(this.E, new Void[0]);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(Point point) {
        this.v = new LinkedHashMap();
        int i = this.u;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int v = v() / i3;
            int u = u() / i4;
            int i5 = v / i;
            int i6 = u / i;
            while (true) {
                if (i5 + i3 + i2 > point.x || (i5 > getWidth() * 1.25d && i < this.u)) {
                    i3++;
                    v = v() / i3;
                    i5 = v / i;
                }
            }
            while (true) {
                if (i6 + i4 + i2 > point.y || (i6 > getHeight() * 1.25d && i < this.u)) {
                    i4++;
                    u = u() / i4;
                    i6 = u / i;
                }
            }
            ArrayList arrayList = new ArrayList(i3 * i4);
            int i7 = 0;
            while (i7 < i3) {
                int i8 = 0;
                while (i8 < i4) {
                    k kVar = new k();
                    kVar.b = i;
                    kVar.e = i == this.u ? i2 : 0;
                    kVar.a = new Rect(i7 * v, i8 * u, i7 == i3 + (-1) ? v() : (i7 + 1) * v, i8 == i4 + (-1) ? u() : (i8 + 1) * u);
                    kVar.f = new Rect(0, 0, 0, 0);
                    kVar.g = new Rect(kVar.a);
                    arrayList.add(kVar);
                    i8++;
                    i2 = 1;
                }
                i7++;
                i2 = 1;
            }
            this.v.put(Integer.valueOf(i), arrayList);
            i2 = 1;
            if (i == 1) {
                return;
            } else {
                i /= 2;
            }
        }
    }

    public final boolean o() {
        boolean z = true;
        if (this.r != null && !this.s) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.v;
        if (linkedHashMap == null) {
            return false;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Integer) entry.getKey()).intValue() == this.u) {
                for (k kVar : (List) entry.getValue()) {
                    if (kVar.d || kVar.c == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        boolean z;
        super.onDraw(canvas);
        if (this.x0 == null) {
            Paint paint = new Paint();
            this.x0 = paint;
            paint.setAntiAlias(true);
            this.x0.setFilterBitmap(true);
            this.x0.setDither(true);
        }
        if (this.U == 0 || this.V == 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.v == null && this.g0 != null) {
            m(new Point(Math.min(canvas.getMaximumBitmapWidth(), this.C), Math.min(canvas.getMaximumBitmapHeight(), this.D)));
        }
        if (h()) {
            r();
            g gVar = this.s0;
            boolean z2 = false;
            if (gVar != null && gVar.e != null) {
                if (this.Q == null) {
                    this.Q = new PointF(0.0f, 0.0f);
                }
                this.Q.set(this.O);
                long currentTimeMillis = System.currentTimeMillis();
                g gVar2 = this.s0;
                long j = currentTimeMillis - gVar2.k;
                long j2 = gVar2.g;
                boolean z3 = j > j2;
                long min = Math.min(j, j2);
                g gVar3 = this.s0;
                int i = gVar3.i;
                float f2 = gVar3.a;
                this.M = j(i, min, f2, gVar3.b - f2, gVar3.g);
                g gVar4 = this.s0;
                int i2 = gVar4.i;
                float f3 = gVar4.e.x;
                float j3 = j(i2, min, f3, gVar4.f.x - f3, gVar4.g);
                g gVar5 = this.s0;
                int i3 = gVar5.i;
                float f4 = gVar5.e.y;
                float j4 = j(i3, min, f4, gVar5.f.y - f4, gVar5.g);
                this.O.x -= x(this.s0.d.x) - j3;
                this.O.y -= y(this.s0.d.y) - j4;
                if (!z3) {
                    g gVar6 = this.s0;
                    if (gVar6.a != gVar6.b) {
                        z = false;
                        k(z);
                        int i4 = this.s0.j;
                        s(z3);
                        if (z3) {
                            this.s0.getClass();
                            this.s0 = null;
                        }
                        invalidate();
                    }
                }
                z = true;
                k(z);
                int i42 = this.s0.j;
                s(z3);
                if (z3) {
                }
                invalidate();
            }
            if (this.v == null || !o()) {
                if (this.r != null) {
                    float f5 = this.M;
                    if (this.s) {
                        f5 *= this.U / r2.getWidth();
                        f = this.M * (this.V / this.r.getHeight());
                    } else {
                        f = f5;
                    }
                    if (this.A0 == null) {
                        this.A0 = new Matrix();
                    }
                    this.A0.reset();
                    this.A0.postScale(f5, f);
                    this.A0.postRotate(getRequiredRotation());
                    Matrix matrix = this.A0;
                    PointF pointF = this.O;
                    matrix.postTranslate(pointF.x, pointF.y);
                    if (getRequiredRotation() == 180) {
                        Matrix matrix2 = this.A0;
                        float f6 = this.M;
                        matrix2.postTranslate(this.U * f6, f6 * this.V);
                    } else if (getRequiredRotation() == 90) {
                        this.A0.postTranslate(this.M * this.V, 0.0f);
                    } else if (getRequiredRotation() == 270) {
                        this.A0.postTranslate(0.0f, this.M * this.U);
                    }
                    if (this.y0 != null) {
                        if (this.B0 == null) {
                            this.B0 = new RectF();
                        }
                        this.B0.set(0.0f, 0.0f, this.s ? this.r.getWidth() : this.U, this.s ? this.r.getHeight() : this.V);
                        this.A0.mapRect(this.B0);
                        canvas.drawRect(this.B0, this.y0);
                    }
                    canvas.drawBitmap(this.r, this.A0, this.x0);
                    return;
                }
                return;
            }
            int min2 = Math.min(this.u, f(this.M));
            for (Map.Entry entry : this.v.entrySet()) {
                if (((Integer) entry.getKey()).intValue() == min2) {
                    for (k kVar : (List) entry.getValue()) {
                        if (kVar.e && (kVar.d || kVar.c == null)) {
                            z2 = true;
                        }
                    }
                }
            }
            for (Map.Entry entry2 : this.v.entrySet()) {
                if (((Integer) entry2.getKey()).intValue() == min2 || z2) {
                    for (k kVar2 : (List) entry2.getValue()) {
                        Rect rect = kVar2.a;
                        kVar2.f.set((int) x(rect.left), (int) y(rect.top), (int) x(rect.right), (int) y(rect.bottom));
                        if (!kVar2.d && kVar2.c != null) {
                            Paint paint2 = this.y0;
                            if (paint2 != null) {
                                canvas.drawRect(kVar2.f, paint2);
                            }
                            if (this.A0 == null) {
                                this.A0 = new Matrix();
                            }
                            this.A0.reset();
                            w(this.C0, 0.0f, 0.0f, kVar2.c.getWidth(), 0.0f, kVar2.c.getWidth(), kVar2.c.getHeight(), 0.0f, kVar2.c.getHeight());
                            if (getRequiredRotation() == 0) {
                                Rect rect2 = kVar2.f;
                                float f7 = rect2.left;
                                float f8 = rect2.top;
                                float f9 = rect2.right;
                                float f10 = rect2.bottom;
                                w(this.D0, f7, f8, f9, f8, f9, f10, f7, f10);
                            } else if (getRequiredRotation() == 90) {
                                Rect rect3 = kVar2.f;
                                float f12 = rect3.right;
                                float f13 = rect3.top;
                                float f14 = rect3.bottom;
                                float f15 = rect3.left;
                                w(this.D0, f12, f13, f12, f14, f15, f14, f15, f13);
                            } else if (getRequiredRotation() == 180) {
                                Rect rect4 = kVar2.f;
                                float f16 = rect4.right;
                                float f17 = rect4.bottom;
                                float f18 = rect4.left;
                                float f19 = rect4.top;
                                w(this.D0, f16, f17, f18, f17, f18, f19, f16, f19);
                            } else if (getRequiredRotation() == 270) {
                                Rect rect5 = kVar2.f;
                                float f20 = rect5.left;
                                float f22 = rect5.bottom;
                                float f23 = rect5.top;
                                float f24 = rect5.right;
                                w(this.D0, f20, f22, f20, f23, f24, f23, f24, f22);
                            }
                            this.A0.setPolyToPoly(this.C0, 0, this.D0, 0, 4);
                            canvas.drawBitmap(kVar2.c, this.A0, this.x0);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = mode != 1073741824;
        boolean z2 = mode2 != 1073741824;
        if (this.U > 0 && this.V > 0) {
            if (z && z2) {
                size = v();
                size2 = u();
            } else if (z2) {
                size2 = (int) ((u() / v()) * size);
            } else if (z) {
                size = (int) ((v() / u()) * size2);
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        PointF center = getCenter();
        if (!this.t0 || center == null) {
            return;
        }
        this.s0 = null;
        this.R = Float.valueOf(this.M);
        this.S = center;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0080, code lost:
    
        if (r5 != 262) goto L173;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        GestureDetector gestureDetector;
        g gVar = this.s0;
        if (gVar == null || gVar.h) {
            PointF pointF = null;
            this.s0 = null;
            if (this.O == null) {
                GestureDetector gestureDetector2 = this.f0;
                if (gestureDetector2 != null) {
                    gestureDetector2.onTouchEvent(motionEvent);
                    return true;
                }
            } else {
                if (!this.c0 && ((gestureDetector = this.e0) == null || gestureDetector.onTouchEvent(motionEvent))) {
                    this.a0 = false;
                    this.b0 = false;
                    this.d0 = 0;
                    return true;
                }
                float f = 0.0f;
                if (this.P == null) {
                    this.P = new PointF(0.0f, 0.0f);
                }
                if (this.Q == null) {
                    this.Q = new PointF(0.0f, 0.0f);
                }
                if (this.k0 == null) {
                    this.k0 = new PointF(0.0f, 0.0f);
                }
                this.Q.set(this.O);
                int pointerCount = motionEvent.getPointerCount();
                int action = motionEvent.getAction();
                Handler handler = this.w0;
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action != 5) {
                                if (action != 6) {
                                    if (action != 261) {
                                    }
                                }
                            }
                        } else if (this.d0 > 0) {
                            if (pointerCount < 2) {
                                if (this.c0) {
                                    float abs = (Math.abs(this.r0.y - motionEvent.getY()) * 2.0f) + this.m0;
                                    if (this.n0 == -1.0f) {
                                        this.n0 = abs;
                                    }
                                    float y = motionEvent.getY();
                                    PointF pointF2 = this.p0;
                                    boolean z2 = y > pointF2.y;
                                    pointF2.set(0.0f, motionEvent.getY());
                                    float abs2 = Math.abs(1.0f - (abs / this.n0)) * 0.5f;
                                    if (abs2 > 0.03f || this.o0) {
                                        this.o0 = true;
                                        float f2 = this.n0 > 0.0f ? z2 ? abs2 + 1.0f : 1.0f - abs2 : 1.0f;
                                        double d = this.M;
                                        float max = Math.max(p(), Math.min(this.x, this.M * f2));
                                        this.M = max;
                                        if (this.G) {
                                            PointF pointF3 = this.k0;
                                            float f3 = pointF3.x;
                                            PointF pointF4 = this.P;
                                            float f4 = f3 - pointF4.x;
                                            float f5 = pointF3.y;
                                            float f6 = f5 - pointF4.y;
                                            float f7 = max / this.N;
                                            float f8 = f4 * f7;
                                            float f9 = f7 * f6;
                                            PointF pointF5 = this.O;
                                            pointF5.x = f3 - f8;
                                            pointF5.y = f5 - f9;
                                            if ((u() * d >= getHeight() || this.M * u() < getHeight()) && (d * v() >= getWidth() || this.M * v() < getWidth())) {
                                                f = abs;
                                            } else {
                                                k(true);
                                                PointF pointF6 = this.k0;
                                                PointF pointF7 = this.q0;
                                                float f10 = pointF7.x;
                                                float f12 = pointF7.y;
                                                PointF pointF8 = new PointF();
                                                if (this.O != null) {
                                                    pointF8.set(x(f10), y(f12));
                                                    pointF = pointF8;
                                                }
                                                pointF6.set(pointF);
                                                this.P.set(this.O);
                                                this.N = this.M;
                                            }
                                            abs = f;
                                        } else if (this.T != null) {
                                            this.O.x = (getWidth() / 2) - (this.M * this.T.x);
                                            this.O.y = (getHeight() / 2) - (this.M * this.T.y);
                                        } else {
                                            this.O.x = (getWidth() / 2) - (this.M * (v() / 2));
                                            this.O.y = (getHeight() / 2) - (this.M * (u() / 2));
                                        }
                                    }
                                    this.n0 = abs;
                                    k(true);
                                    s(this.F);
                                } else if (!this.a0) {
                                    float abs3 = Math.abs(motionEvent.getX() - this.k0.x);
                                    float abs4 = Math.abs(motionEvent.getY() - this.k0.y);
                                    float f13 = this.E0 * 5.0f;
                                    if (abs3 > f13 || abs4 > f13 || this.b0) {
                                        this.O.x = (motionEvent.getX() - this.k0.x) + this.P.x;
                                        this.O.y = (motionEvent.getY() - this.k0.y) + this.P.y;
                                        PointF pointF9 = this.O;
                                        float f14 = pointF9.x;
                                        float f15 = pointF9.y;
                                        k(true);
                                        PointF pointF10 = this.O;
                                        boolean z3 = f14 != pointF10.x;
                                        float f16 = pointF10.y;
                                        boolean z4 = f15 != f16;
                                        boolean z5 = z3 && abs3 > abs4 && !this.b0;
                                        boolean z6 = z4 && abs4 > abs3 && !this.b0;
                                        boolean z7 = f15 == f16 && abs4 > 3.0f * f13;
                                        if (!z5 && !z6 && (!z3 || !z4 || z7 || this.b0)) {
                                            this.b0 = true;
                                        } else if (abs3 > f13 || abs4 > f13) {
                                            this.d0 = 0;
                                            handler.removeMessages(1);
                                            ViewParent parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(false);
                                            }
                                        }
                                        if (!this.G) {
                                            PointF pointF11 = this.O;
                                            PointF pointF12 = this.P;
                                            pointF11.x = pointF12.x;
                                            pointF11.y = pointF12.y;
                                            ViewParent parent2 = getParent();
                                            if (parent2 != null) {
                                                parent2.requestDisallowInterceptTouchEvent(false);
                                            }
                                        }
                                        s(this.F);
                                    }
                                }
                                handler.removeMessages(1);
                                invalidate();
                                return true;
                            }
                            float x = motionEvent.getX(0) - motionEvent.getX(1);
                            float y2 = motionEvent.getY(0) - motionEvent.getY(1);
                            float sqrt = (float) Math.sqrt((y2 * y2) + (x * x));
                            float x2 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                            float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                            if (this.H) {
                                PointF pointF13 = this.k0;
                                float f17 = pointF13.x - x2;
                                float f18 = pointF13.y - y3;
                                if (((float) Math.sqrt((f18 * f18) + (f17 * f17))) > 5.0f || Math.abs(sqrt - this.l0) > 5.0f || this.b0) {
                                    this.a0 = true;
                                    this.b0 = true;
                                    double d2 = this.M;
                                    float min = Math.min(this.x, (sqrt / this.l0) * this.N);
                                    this.M = min;
                                    if (min <= p()) {
                                        this.l0 = sqrt;
                                        this.N = p();
                                        this.k0.set(x2, y3);
                                        this.P.set(this.O);
                                    } else if (this.G) {
                                        PointF pointF14 = this.k0;
                                        float f19 = pointF14.x;
                                        PointF pointF15 = this.P;
                                        float f20 = f19 - pointF15.x;
                                        float f22 = pointF14.y - pointF15.y;
                                        float f23 = this.M / this.N;
                                        float f24 = f20 * f23;
                                        float f25 = f23 * f22;
                                        PointF pointF16 = this.O;
                                        pointF16.x = x2 - f24;
                                        pointF16.y = y3 - f25;
                                        if ((u() * d2 < getHeight() && this.M * u() >= getHeight()) || (d2 * v() < getWidth() && this.M * v() >= getWidth())) {
                                            k(true);
                                            this.k0.set(x2, y3);
                                            this.P.set(this.O);
                                            this.N = this.M;
                                            this.l0 = sqrt;
                                        }
                                    } else if (this.T != null) {
                                        this.O.x = (getWidth() / 2) - (this.M * this.T.x);
                                        this.O.y = (getHeight() / 2) - (this.M * this.T.y);
                                    } else {
                                        this.O.x = (getWidth() / 2) - (this.M * (v() / 2));
                                        this.O.y = (getHeight() / 2) - (this.M * (u() / 2));
                                    }
                                    k(true);
                                    s(this.F);
                                    handler.removeMessages(1);
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                        if (!super.onTouchEvent(motionEvent)) {
                            return false;
                        }
                    }
                    handler.removeMessages(1);
                    if (this.c0) {
                        this.c0 = false;
                        if (!this.o0) {
                            i(this.q0, this.k0);
                        }
                    }
                    if (this.d0 > 0 && ((z = this.a0) || this.b0)) {
                        if (z && pointerCount == 2) {
                            this.b0 = true;
                            PointF pointF17 = this.P;
                            PointF pointF18 = this.O;
                            pointF17.set(pointF18.x, pointF18.y);
                            if (motionEvent.getActionIndex() == 1) {
                                this.k0.set(motionEvent.getX(0), motionEvent.getY(0));
                            } else {
                                this.k0.set(motionEvent.getX(1), motionEvent.getY(1));
                            }
                        }
                        if (pointerCount < 3) {
                            this.a0 = false;
                        }
                        if (pointerCount < 2) {
                            this.b0 = false;
                            this.d0 = 0;
                        }
                        s(true);
                        return true;
                    }
                    if (pointerCount == 1) {
                        this.a0 = false;
                        this.b0 = false;
                        this.d0 = 0;
                        return true;
                    }
                }
                this.s0 = null;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                this.d0 = Math.max(this.d0, pointerCount);
                if (pointerCount >= 2) {
                    if (this.H) {
                        float x3 = motionEvent.getX(0) - motionEvent.getX(1);
                        float y4 = motionEvent.getY(0) - motionEvent.getY(1);
                        float sqrt2 = (float) Math.sqrt((y4 * y4) + (x3 * x3));
                        this.N = this.M;
                        this.l0 = sqrt2;
                        PointF pointF19 = this.P;
                        PointF pointF20 = this.O;
                        pointF19.set(pointF20.x, pointF20.y);
                        this.k0.set((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f);
                    } else {
                        this.d0 = 0;
                    }
                    handler.removeMessages(1);
                    return true;
                }
                if (!this.c0) {
                    PointF pointF21 = this.P;
                    PointF pointF22 = this.O;
                    pointF21.set(pointF22.x, pointF22.y);
                    this.k0.set(motionEvent.getX(), motionEvent.getY());
                    handler.sendEmptyMessageDelayed(1, 600L);
                }
            }
        } else {
            ViewParent parent4 = getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(true);
                return true;
            }
        }
        return true;
    }

    public final float p() {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i = this.B;
        if (i == 2 || i == 4) {
            return Math.max((getWidth() - paddingRight) / v(), (getHeight() - paddingTop) / u());
        }
        if (i == 3) {
            float f = this.y;
            if (f > 0.0f) {
                return f;
            }
        }
        return Math.min((getWidth() - paddingRight) / v(), (getHeight() - paddingTop) / u());
    }

    public final synchronized void q(Bitmap bitmap, int i) {
        try {
            int i2 = this.U;
            if (i2 > 0) {
                if (this.V > 0) {
                    if (i2 == bitmap.getWidth()) {
                        if (this.V != bitmap.getHeight()) {
                        }
                    }
                    t(false);
                }
            }
            Bitmap bitmap2 = this.r;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.s = false;
            this.r = bitmap;
            this.U = bitmap.getWidth();
            this.V = bitmap.getHeight();
            this.W = i;
            boolean h = h();
            boolean g = g();
            if (h || g) {
                invalidate();
                requestLayout();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void r() {
        Float f;
        if (getWidth() == 0 || getHeight() == 0 || this.U <= 0 || this.V <= 0) {
            return;
        }
        if (this.S != null && (f = this.R) != null) {
            this.M = f.floatValue();
            if (this.O == null) {
                this.O = new PointF();
            }
            this.O.x = (getWidth() / 2) - (this.M * this.S.x);
            this.O.y = (getHeight() / 2) - (this.M * this.S.y);
            this.S = null;
            this.R = null;
            k(true);
            s(true);
        }
        k(false);
    }

    public final void s(boolean z) {
        if (this.g0 == null || this.v == null) {
            return;
        }
        int min = Math.min(this.u, f(this.M));
        Iterator it = this.v.entrySet().iterator();
        while (it.hasNext()) {
            for (k kVar : (List) ((Map.Entry) it.next()).getValue()) {
                int i = kVar.b;
                if (i < min || (i > min && i != this.u)) {
                    kVar.e = false;
                    Bitmap bitmap = kVar.c;
                    if (bitmap != null) {
                        bitmap.recycle();
                        kVar.c = null;
                    }
                }
                int i2 = kVar.b;
                if (i2 == min) {
                    PointF pointF = this.O;
                    float f = pointF == null ? Float.NaN : (0.0f - pointF.x) / this.M;
                    float width = getWidth();
                    PointF pointF2 = this.O;
                    float f2 = pointF2 == null ? Float.NaN : (width - pointF2.x) / this.M;
                    float f3 = pointF2 == null ? Float.NaN : (0.0f - pointF2.y) / this.M;
                    float height = getHeight();
                    PointF pointF3 = this.O;
                    float f4 = pointF3 != null ? (height - pointF3.y) / this.M : Float.NaN;
                    Rect rect = kVar.a;
                    if (f <= rect.right && rect.left <= f2 && f3 <= rect.bottom && rect.top <= f4) {
                        kVar.e = true;
                        if (!kVar.d && kVar.c == null && z) {
                            new l(this, this.g0, kVar).executeOnExecutor(this.E, new Void[0]);
                        }
                    } else if (kVar.b != this.u) {
                        kVar.e = false;
                        Bitmap bitmap2 = kVar.c;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            kVar.c = null;
                        }
                    }
                } else if (i2 == this.u) {
                    kVar.e = true;
                }
            }
        }
    }

    public final void setBitmapDecoderClass(Class<? extends SkiaImageDecoder> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.i0 = new a(cls);
    }

    public final void setBitmapDecoderFactory(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.i0 = bVar;
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.L = Math.max(0, i);
    }

    public final void setDoubleTapZoomScale(float f) {
        this.J = f;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (!n.b.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(no.a.k("Invalid zoom style: ", i));
        }
        this.K = i;
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.F = z;
    }

    public void setExecutor(Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor must not be null");
        }
        this.E = executor;
    }

    public final void setImage(s61.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("imageSource must not be null");
        }
        Integer num = aVar.c;
        Bitmap bitmap = aVar.b;
        t(true);
        if (bitmap != null) {
            q(bitmap, 0);
            return;
        }
        Uri uri = aVar.a;
        this.t = uri;
        if (uri == null && num != null) {
            this.t = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + num);
        }
        if (aVar.d) {
            new m(this, getContext(), this.j0, this.t).executeOnExecutor(this.E, new Void[0]);
        } else {
            new s61.i(this, getContext(), this.i0, this.t, false).executeOnExecutor(this.E, new Void[0]);
        }
    }

    public final void setMaxScale(float f) {
        this.x = f;
    }

    public void setMaxTileSize(int i) {
        this.C = i;
        this.D = i;
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinScale(float f) {
        this.y = f;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinimumScaleType(int i) {
        if (!n.e.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(no.a.k("Invalid scale type: ", i));
        }
        this.B = i;
        if (this.t0) {
            k(true);
            invalidate();
        }
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.z = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i);
        if (this.t0) {
            t(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(s61.c cVar) {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.v0 = onLongClickListener;
    }

    public void setOnStateChangedListener(d dVar) {
    }

    public final void setOrientation(int i) {
        if (!n.a.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(no.a.k("Invalid orientation: ", i));
        }
        this.w = i;
        t(false);
        invalidate();
        requestLayout();
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.G = z;
        if (z || (pointF = this.O) == null) {
            return;
        }
        pointF.x = (getWidth() / 2) - (this.M * (v() / 2));
        this.O.y = (getHeight() / 2) - (this.M * (u() / 2));
        if (this.t0) {
            s(true);
            invalidate();
        }
    }

    public final void setPanLimit(int i) {
        if (!n.d.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(no.a.k("Invalid pan limit: ", i));
        }
        this.A = i;
        if (this.t0) {
            k(true);
            invalidate();
        }
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.I = z;
    }

    public final void setRegionDecoderClass(Class<? extends c> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.j0 = new a(cls);
    }

    public final void setRegionDecoderFactory(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.j0 = bVar;
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.y0 = null;
        } else {
            Paint paint = new Paint();
            this.y0 = paint;
            paint.setStyle(Paint.Style.FILL);
            this.y0.setColor(i);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.H = z;
    }

    public final void t(boolean z) {
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = Float.valueOf(0.0f);
        this.S = null;
        this.T = null;
        this.a0 = false;
        this.b0 = false;
        this.c0 = false;
        this.d0 = 0;
        this.u = 0;
        this.k0 = null;
        this.l0 = 0.0f;
        this.n0 = 0.0f;
        this.o0 = false;
        this.q0 = null;
        this.p0 = null;
        this.r0 = null;
        this.s0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        if (z) {
            this.t = null;
            ReentrantReadWriteLock reentrantReadWriteLock = this.h0;
            reentrantReadWriteLock.writeLock().lock();
            try {
                c cVar = this.g0;
                if (cVar != null) {
                    cVar.b();
                    this.g0 = null;
                }
                reentrantReadWriteLock.writeLock().unlock();
                Bitmap bitmap = this.r;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.U = 0;
                this.V = 0;
                this.W = 0;
                this.t0 = false;
                this.u0 = false;
                this.r = null;
                this.s = false;
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        }
        LinkedHashMap linkedHashMap = this.v;
        if (linkedHashMap != null) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                for (k kVar : (List) ((Map.Entry) it.next()).getValue()) {
                    kVar.e = false;
                    Bitmap bitmap2 = kVar.c;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        kVar.c = null;
                    }
                }
            }
            this.v = null;
        }
        setGestureDetector(getContext());
    }

    public final int u() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.U : this.V;
    }

    public final int v() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.V : this.U;
    }

    public final float x(float f) {
        PointF pointF = this.O;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.M) + pointF.x;
    }

    public final float y(float f) {
        PointF pointF = this.O;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.M) + pointF.y;
    }

    public final PointF z(float f, float f2, float f3) {
        int width = (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2) + getPaddingLeft();
        int height = (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2) + getPaddingTop();
        if (this.z0 == null) {
            this.z0 = new j(0.0f, new PointF(0.0f, 0.0f));
        }
        j jVar = this.z0;
        jVar.a = f3;
        jVar.b.set(width - (f * f3), height - (f2 * f3));
        l(true, this.z0);
        return this.z0.b;
    }
}
