package ta;

import a0.s0;
import k71.k;
import x01.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public String f32167a;

    /* renamed from: b, reason: collision with root package name */
    public String f32168b;

    /* renamed from: c, reason: collision with root package name */
    public i f32169c;

    /* renamed from: d, reason: collision with root package name */
    public mn.a f32170d;

    public b(String str, String str2, i iVar, mn.a aVar) {
        k.g(str, "id");
        this.f32167a = str;
        this.f32168b = str2;
        this.f32169c = iVar;
        this.f32170d = aVar;
    }

    @Override // ta.d
    public final i a() {
        return this.f32169c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.f32167a, bVar.f32167a) && k.b(this.f32168b, bVar.f32168b) && k.b(this.f32169c, bVar.f32169c) && k.b(this.f32170d, bVar.f32170d);
    }

    public final int hashCode() {
        int hashCode = this.f32167a.hashCode() * 31;
        String str = this.f32168b;
        return this.f32170d.hashCode() + ((this.f32169c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o5 = s0.o("CheckRunElement(id=", this.f32167a, ", checkSuiteId=", this.f32168b, ", parentPage=");
        o5.append(this.f32169c);
        o5.append(", actionCheckRun=");
        o5.append(this.f32170d);
        o5.append(")");
        return o5.toString();
    }
}
