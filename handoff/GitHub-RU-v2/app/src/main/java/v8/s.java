package v8;

/* loaded from: /home/user/work/p/classes.dex */
public class s extends v {

    /* renamed from: a, reason: collision with root package name */
    public final i f32840a = i.f32789b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        return this.f32840a.equals(((s) obj).f32840a);
    }

    public final int hashCode() {
        return this.f32840a.hashCode() + (s.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f32840a + '}';
    }
}
