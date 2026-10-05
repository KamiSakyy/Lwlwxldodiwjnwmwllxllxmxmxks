package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dc {
    public final ac a;
    public final ec b;

    public dc(ac acVar, ec ecVar) {
        this.a = acVar;
        this.b = ecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return k71.k.b(this.a, dcVar.a) && k71.k.b(this.b, dcVar.b);
    }

    public final int hashCode() {
        ac acVar = this.a;
        int hashCode = (acVar == null ? 0 : acVar.hashCode()) * 31;
        ec ecVar = this.b;
        return hashCode + (ecVar != null ? ecVar.hashCode() : 0);
    }

    public final String toString() {
        return "EnablePullRequestAutoMerge(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
