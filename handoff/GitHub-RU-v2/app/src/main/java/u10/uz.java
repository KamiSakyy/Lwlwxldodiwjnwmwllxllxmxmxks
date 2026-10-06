package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uz implements aaShadow.v0 {
    public final yz a;

    public uz(yz yzVar) {
        this.a = yzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uz) && k71.k.b(this.a, ((uz) obj).a);
    }

    public final int hashCode() {
        yz yzVar = this.a;
        if (yzVar == null) {
            return 0;
        }
        return yzVar.hashCode();
    }

    public final String toString() {
        return "Data(repositoryOwner=" + this.a + ")";
    }
}
