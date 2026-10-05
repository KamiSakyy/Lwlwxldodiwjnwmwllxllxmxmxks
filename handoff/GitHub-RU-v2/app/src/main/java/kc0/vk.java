package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vk {
    public final rk a;
    public final xk b;

    public vk(rk rkVar, xk xkVar) {
        this.a = rkVar;
        this.b = xkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk)) {
            return false;
        }
        vk vkVar = (vk) obj;
        return k71.k.b(this.a, vkVar.a) && k71.k.b(this.b, vkVar.b);
    }

    public final int hashCode() {
        rk rkVar = this.a;
        int hashCode = (rkVar == null ? 0 : rkVar.hashCode()) * 31;
        xk xkVar = this.b;
        return hashCode + (xkVar != null ? xkVar.hashCode() : 0);
    }

    public final String toString() {
        return "MergePullRequest(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
