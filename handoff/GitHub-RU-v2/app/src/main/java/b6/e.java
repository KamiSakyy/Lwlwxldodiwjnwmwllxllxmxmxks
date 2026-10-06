package b6;

/* loaded from: /home/user/work/p/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public String f3521a;

    public e(String str) {
        this.f3521a = str;
    }

    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        return (obj instanceof e) && k71.k.b(((e) obj).f3521a, this.f3521a);
    }
}
