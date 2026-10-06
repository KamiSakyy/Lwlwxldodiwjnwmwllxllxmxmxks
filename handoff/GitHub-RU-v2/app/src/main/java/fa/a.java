package fa;

import ea.c;
import ea.f;
import java.util.LinkedHashMap;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements f {

    /* renamed from: r, reason: collision with root package name */
    public final f f24382r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f24383s = new LinkedHashMap();

    public a(f fVar) {
        this.f24382r = fVar;
    }

    @Override // ea.f
    public final f C(double d10) {
        this.f24382r.C(d10);
        return this;
    }

    @Override // ea.f
    public final f I(String str) {
        k.g(str, "value");
        this.f24382r.I(str);
        return this;
    }

    @Override // ea.f
    public final f X(boolean z10) {
        this.f24382r.X(z10);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24382r.close();
    }

    @Override // ea.f
    public final f e() {
        this.f24382r.e();
        return this;
    }

    @Override // ea.f
    public final String h() {
        return this.f24382r.h();
    }

    @Override // ea.f
    public final f j() {
        this.f24382r.j();
        return this;
    }

    @Override // ea.f
    public final f k() {
        this.f24382r.k();
        return this;
    }

    @Override // ea.f
    public final f n() {
        this.f24382r.n();
        return this;
    }

    @Override // ea.f
    public final f v0() {
        this.f24382r.v0();
        return this;
    }

    @Override // ea.f
    public final f value() {
        k.g((Object) null, "value");
        f fVar = this.f24382r;
        this.f24383s.put(fVar.h(), null);
        fVar.v0();
        return this;
    }

    @Override // ea.f
    public final f y(long j10) {
        this.f24382r.y(j10);
        return this;
    }

    @Override // ea.f
    public final f y0(c cVar) {
        k.g(cVar, "value");
        this.f24382r.y0(cVar);
        return this;
    }

    @Override // ea.f
    public final f z(int i) {
        this.f24382r.z(i);
        return this;
    }

    @Override // ea.f
    public final f z0(String str) {
        this.f24382r.z0(str);
        return this;
    }
}
