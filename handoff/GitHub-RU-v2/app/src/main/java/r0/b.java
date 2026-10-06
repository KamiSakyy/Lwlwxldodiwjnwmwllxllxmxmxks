package r0;

import s3.f;

/* loaded from: /home/user/work/p/classes.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public float f31062a;

    public b(float f6) {
        this.f31062a = f6;
    }

    @Override // r0.a
    public final float a(long j10, s3.c cVar) {
        return cVar.W(this.f31062a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.b(this.f31062a, ((b) obj).f31062a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f31062a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f31062a + ".dp)";
    }
}
