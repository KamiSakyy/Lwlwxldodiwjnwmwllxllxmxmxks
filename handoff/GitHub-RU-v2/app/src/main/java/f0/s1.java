package f0;

import android.widget.Magnifier;

/* loaded from: /home/user/work/p/classes.dex */
public class s1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public Magnifier f22366a;

    public s1(Magnifier magnifier) {
        this.f22366a = magnifier;
    }

    @Override // f0.q1
    public void a(long j10, long j11) {
        this.f22366a.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public final void b() {
        this.f22366a.dismiss();
    }

    public final long c() {
        return (this.f22366a.getHeight() & 4294967295L) | (this.f22366a.getWidth() << 32);
    }

    public final void d() {
        this.f22366a.update();
    }
}
