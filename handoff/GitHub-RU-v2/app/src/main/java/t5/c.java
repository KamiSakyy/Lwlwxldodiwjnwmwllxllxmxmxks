package t5;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import androidx.fragment.app.s;
import java.util.ArrayList;
import l3.a0;
import l7.x1;
import x.q0;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {
    public static final ThreadLocal i = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public x1 f32067e;

    /* renamed from: h, reason: collision with root package name */
    public b f32070h;

    /* renamed from: a, reason: collision with root package name */
    public final q0 f32063a = new q0(0);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32064b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final s21.a f32065c = new s21.a(6, this);

    /* renamed from: d, reason: collision with root package name */
    public final s f32066d = new s(21, this);

    /* renamed from: f, reason: collision with root package name */
    public boolean f32068f = false;

    /* renamed from: g, reason: collision with root package name */
    public float f32069g = 1.0f;

    public c(x1 x1Var) {
        this.f32067e = x1Var;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, t5.a] */
    public final void a(e eVar) {
        ArrayList arrayList = this.f32064b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.f32067e.f28354r).postFrameCallback(new a0(this.f32066d, 1));
            if (Build.VERSION.SDK_INT >= 33) {
                this.f32069g = ValueAnimator.getDurationScale();
                if (this.f32070h == null) {
                    this.f32070h = new b(this);
                }
                final b bVar = this.f32070h;
                if (bVar.f32061a == null) {
                    ValueAnimator.DurationScaleChangeListener r22 = new ValueAnimator.DurationScaleChangeListener() { // from class: t5.a;
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f6) {
                            b.this.f32062b.f32069g = f6;
                        }
                    };
                    bVar.f32061a = r22;
                    ValueAnimator.registerDurationScaleChangeListener(r22);
                }
            }
        }
        if (arrayList.contains(eVar)) {
            return;
        }
        arrayList.add(eVar);
    }
}
