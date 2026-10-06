package b8;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f3793a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public Paint f3794b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f3795c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f3796d;

    /* renamed from: e, reason: collision with root package name */
    public float f3797e;

    /* renamed from: f, reason: collision with root package name */
    public float f3798f;

    /* renamed from: g, reason: collision with root package name */
    public float f3799g;

    /* renamed from: h, reason: collision with root package name */
    public float f3800h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int f3801j;

    /* renamed from: k, reason: collision with root package name */
    public float f3802k;
    public float l;
    public float m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3803n;

    /* renamed from: o, reason: collision with root package name */
    public Path f3804o;

    /* renamed from: p, reason: collision with root package name */
    public float f3805p;

    /* renamed from: q, reason: collision with root package name */
    public float f3806q;

    /* renamed from: r, reason: collision with root package name */
    public int f3807r;

    /* renamed from: s, reason: collision with root package name */
    public int f3808s;

    /* renamed from: t, reason: collision with root package name */
    public int f3809t;

    /* renamed from: u, reason: collision with root package name */
    public int f3810u;

    public d() {
        Paint paint = new Paint();
        this.f3794b = paint;
        Paint paint2 = new Paint();
        this.f3795c = paint2;
        Paint paint3 = new Paint();
        this.f3796d = paint3;
        this.f3797e = 0.0f;
        this.f3798f = 0.0f;
        this.f3799g = 0.0f;
        this.f3800h = 5.0f;
        this.f3805p = 1.0f;
        this.f3809t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i) {
        this.f3801j = i;
        this.f3810u = this.i[i];
    }
}
