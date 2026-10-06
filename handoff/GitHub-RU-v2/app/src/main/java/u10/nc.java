package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nc {
    public final String a;
    public final pc b;
    public final qc c;

    public nc(String str, pc pcVar, qc qcVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = pcVar;
        this.c = qcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) obj;
        return k71.k.b(this.a, ncVar.a) && k71.k.b(this.b, ncVar.b) && k71.k.b(this.c, ncVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pc pcVar = this.b;
        int hashCode2 = (hashCode + (pcVar == null ? 0 : pcVar.hashCode())) * 31;
        qc qcVar = this.c;
        return hashCode2 + (qcVar != null ? qcVar.hashCode() : 0);
    }

    public final String toString() {
        return "FileType(__typename=" + this.a + ", onMarkdownFileType=" + this.b + ", onTextFileType=" + this.c + ")";
    }
}
