package il;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public l01.v a;
    public l01.w b;

    public s(l01.v vVar, l01.w wVar) {
        k71.k.g(vVar, "projectBoardItem");
        this.a = vVar;
        this.b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l01.w wVar = this.b;
        return hashCode + (wVar == null ? 0 : wVar.a.hashCode());
    }

    public final String toString() {
        return "ProjectItemWithRelatedProjects(projectBoardItem=" + this.a + ", relatedItems=" + this.b + ")";
    }
}
