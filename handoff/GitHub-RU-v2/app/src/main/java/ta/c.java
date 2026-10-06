package ta;

import k71.k;
import mn.f;
import x01.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f32171a;

    /* renamed from: b, reason: collision with root package name */
    public final i f32172b;

    /* renamed from: c, reason: collision with root package name */
    public final f f32173c;

    public c(String str, i iVar, f fVar) {
        k.g(str, "id");
        this.f32171a = str;
        this.f32172b = iVar;
        this.f32173c = fVar;
    }

    @Override // ta.d
    public final i a() {
        return this.f32172b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.f32171a, cVar.f32171a) && k.b(this.f32172b, cVar.f32172b) && k.b(this.f32173c, cVar.f32173c);
    }

    public final int hashCode() {
        return this.f32173c.hashCode() + ((this.f32172b.hashCode() + (this.f32171a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CheckSuiteElement(id=" + this.f32171a + ", parentPage=" + this.f32172b + ", actionCheckSuite=" + this.f32173c + ")";
    }
}
