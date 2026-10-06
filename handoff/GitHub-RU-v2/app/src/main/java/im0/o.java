package im0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public String a;
    public p b;

    public o(String str, p pVar) {
        this.a = str;
        this.b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        p pVar = this.b;
        return hashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
