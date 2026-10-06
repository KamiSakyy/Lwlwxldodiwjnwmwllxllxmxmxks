package a00;

import com.github.service.models.response.ProjectV2OrderField;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public String a;
    public ProjectV2OrderField b;
    public v01.a c;

    public c(String str, ProjectV2OrderField projectV2OrderField, v01.a aVar) {
        k.g(str, "query");
        k.g(projectV2OrderField, "orderField");
        k.g(aVar, "orderDirection");
        this.a = str;
        this.b = projectV2OrderField;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "UserProjectsParameters(query=" + this.a + ", orderField=" + this.b + ", orderDirection=" + this.c + ")";
    }
}
