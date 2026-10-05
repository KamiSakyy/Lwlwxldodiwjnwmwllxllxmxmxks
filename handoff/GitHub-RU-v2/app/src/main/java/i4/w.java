package i4;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: /home/user/work/p/classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public float f25999a = Float.NaN;

    /* renamed from: b, reason: collision with root package name */
    public float f26000b = Float.NaN;

    /* renamed from: c, reason: collision with root package name */
    public int f26001c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f26002d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f26003e;

    public w(MotionLayout motionLayout) {
        this.f26003e = motionLayout;
    }

    public final void a() {
        int i = this.f26001c;
        MotionLayout motionLayout = this.f26003e;
        if (i != -1 || this.f26002d != -1) {
            if (i == -1) {
                motionLayout.E(this.f26002d);
            } else {
                int i10 = this.f26002d;
                if (i10 == -1) {
                    motionLayout.A(i);
                } else {
                    motionLayout.B(i, i10);
                }
            }
            motionLayout.setState(y.f26005s);
        }
        if (Float.isNaN(this.f26000b)) {
            if (Float.isNaN(this.f25999a)) {
                return;
            }
            motionLayout.setProgress(this.f25999a);
            return;
        }
        float f6 = this.f25999a;
        float f10 = this.f26000b;
        if (motionLayout.isAttachedToWindow()) {
            motionLayout.setProgress(f6);
            motionLayout.setState(y.f26006t);
            motionLayout.K = f10;
            if (f10 != 0.0f) {
                motionLayout.p(f10 > 0.0f ? 1.0f : 0.0f);
            } else if (f6 != 0.0f && f6 != 1.0f) {
                motionLayout.p(f6 > 0.5f ? 1.0f : 0.0f);
            }
        } else {
            if (motionLayout.I0 == null) {
                motionLayout.I0 = new w(motionLayout);
            }
            w wVar = motionLayout.I0;
            wVar.f25999a = f6;
            wVar.f26000b = f10;
        }
        this.f25999a = Float.NaN;
        this.f26000b = Float.NaN;
        this.f26001c = -1;
        this.f26002d = -1;
    }







}
