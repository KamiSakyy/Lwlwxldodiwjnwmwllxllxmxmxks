package v8;

import android.net.NetworkRequest;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: j, reason: collision with root package name */
    public static final f f32772j = new f();

    /* renamed from: a, reason: collision with root package name */
    public y f32773a;

    /* renamed from: b, reason: collision with root package name */
    public e9.i f32774b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32775c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32776d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32777e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32778f;

    /* renamed from: g, reason: collision with root package name */
    public long f32779g;

    /* renamed from: h, reason: collision with root package name */
    public long f32780h;
    public Set i;

    public f() {
        y yVar = y.f32849r;
        this.f32774b = new e9.i(null);
        this.f32773a = yVar;
        this.f32775c = false;
        this.f32776d = false;
        this.f32777e = false;
        this.f32778f = false;
        this.f32779g = -1L;
        this.f32780h = -1L;
        this.i = x61.t.r;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.f32774b.f22146a;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !f.class.equals(obj.getClass())) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f32775c == fVar.f32775c && this.f32776d == fVar.f32776d && this.f32777e == fVar.f32777e && this.f32778f == fVar.f32778f && this.f32779g == fVar.f32779g && this.f32780h == fVar.f32780h && k71.k.b(a(), fVar.a()) && this.f32773a == fVar.f32773a) {
            return k71.k.b(this.i, fVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f32773a.hashCode() * 31) + (this.f32775c ? 1 : 0)) * 31) + (this.f32776d ? 1 : 0)) * 31) + (this.f32777e ? 1 : 0)) * 31) + (this.f32778f ? 1 : 0)) * 31;
        long j10 = this.f32779g;
        int i = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f32780h;
        int hashCode2 = (this.i.hashCode() + ((i + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31;
        NetworkRequest a10 = a();
        return hashCode2 + (a10 != null ? a10.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f32773a + ", requiresCharging=" + this.f32775c + ", requiresDeviceIdle=" + this.f32776d + ", requiresBatteryNotLow=" + this.f32777e + ", requiresStorageNotLow=" + this.f32778f + ", contentTriggerUpdateDelayMillis=" + this.f32779g + ", contentTriggerMaxDelayMillis=" + this.f32780h + ", contentUriTriggers=" + this.i + ", }";
    }

    public f(e9.i iVar, y yVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set) {
        this.f32774b = iVar;
        this.f32773a = yVar;
        this.f32775c = z10;
        this.f32776d = z11;
        this.f32777e = z12;
        this.f32778f = z13;
        this.f32779g = j10;
        this.f32780h = j11;
        this.i = set;
    }

    public f(f fVar) {
        k71.k.g(fVar, "other");
        this.f32775c = fVar.f32775c;
        this.f32776d = fVar.f32776d;
        this.f32774b = fVar.f32774b;
        this.f32773a = fVar.f32773a;
        this.f32777e = fVar.f32777e;
        this.f32778f = fVar.f32778f;
        this.i = fVar.i;
        this.f32779g = fVar.f32779g;
        this.f32780h = fVar.f32780h;
    }
    public static final Object J = null;
    public Object a = null;
    public Object d = null;
    public Object e = null;
    public Object g = null;
    public Object h = null;
}
