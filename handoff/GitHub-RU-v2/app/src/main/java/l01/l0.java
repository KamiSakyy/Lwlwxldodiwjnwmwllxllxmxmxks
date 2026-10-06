package l01;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.projects.ProjectViewLayoutType;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l0 implements Parcelable {
    public static final l0 z;
    public String r;
    public int s;
    public String t;
    public ProjectViewLayoutType u;
    public int v;
    public Object w;
    public Set x;
    public Set y;
    public static final k0 Companion = new k0();
    public static final Parcelable.Creator<l0> CREATOR = new c(22);

    static {
        ProjectViewLayoutType projectViewLayoutType = ProjectViewLayoutType.TABLE;
        x61.r rVar = x61.r.r;
        x61.t tVar = x61.t.r;
        z = new l0("", 0, "", projectViewLayoutType, 1, rVar, tVar, tVar);
    }

    public l0(String str, int i, String str2, ProjectViewLayoutType projectViewLayoutType, int i2, List list, Set set, Set set2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "name");
        k71.k.g(projectViewLayoutType, "layout");
        this.r = str;
        this.s = i;
        this.t = str2;
        this.u = projectViewLayoutType;
        this.v = i2;
        this.w = list;
        this.x = set;
        this.y = set2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.r, l0Var.r) && this.s == l0Var.s && k71.k.b(this.t, l0Var.t) && this.u == l0Var.u && this.v == l0Var.v && this.w.equals(l0Var.w) && this.x.equals(l0Var.x) && this.y.equals(l0Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + ((this.x.hashCode() + h1.h(a0.s0.b(this.v, (this.u.hashCode() + h1.i(a0.s0.b(this.s, this.r.hashCode() * 31, 31), this.t, 31)) * 31, 31), this.w, 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.s, "ProjectView(id=", this.r, ", databaseId=", ", name=");
        n.append(this.t);
        n.append(", layout=");
        n.append(this.u);
        n.append(", number=");
        n.append(this.v);
        n.append(", groupByFields=");
        n.append(this.w);
        n.append(", visibleFieldIds=");
        n.append(this.x);
        n.append(", visibleFieldsDataType=");
        n.append(this.y);
        n.append(")");
        return n.toString();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u.name());
        parcel.writeInt(this.v);
        java.util.List r0 = (java.util.List) (this.w);
        parcel.writeInt(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        Set set = this.x;
        parcel.writeInt(set.size());
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            parcel.writeString((String) it2.next());
        }
        Set set2 = this.y;
        parcel.writeInt(set2.size());
        Iterator it3 = set2.iterator();
        while (it3.hasNext()) {
            parcel.writeString(((ProjectFieldType) it3.next()).name());
        }
    }
}
