package v8;

/* loaded from: /home/user/work/p/classes.dex */
public final class u extends v {

    /* renamed from: a, reason: collision with root package name */
    public final i f32841a;

    public u(i iVar) {
        this.f32841a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return this.f32841a.equals(((u) obj).f32841a);
    }

    public final int hashCode() {
        return this.f32841a.hashCode() + (u.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f32841a + '}';
    }
}
