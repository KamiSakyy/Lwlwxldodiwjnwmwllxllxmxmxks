package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tk implements aa.m0 {
    public final vk a;

    public tk(vk vkVar) {
        this.a = vkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk) && k71.k.b(this.a, ((tk) obj).a);
    }

    public final int hashCode() {
        vk vkVar = this.a;
        if (vkVar == null) {
            return 0;
        }
        return vkVar.hashCode();
    }

    public final String toString() {
        return "Data(mergePullRequest=" + this.a + ")";
    }
}
