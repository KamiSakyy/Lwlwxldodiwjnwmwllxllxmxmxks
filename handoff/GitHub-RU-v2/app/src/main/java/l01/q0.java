package l01;

import com.github.service.models.response.projects.ProjectViewItemSortableValueType;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 {
    public String a;
    public ProjectViewItemSortableValueType b;

    public q0(String str, ProjectViewItemSortableValueType projectViewItemSortableValueType) {
        k71.k.g(projectViewItemSortableValueType, "type");
        this.a = str;
        this.b = projectViewItemSortableValueType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && this.b == q0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ProjectViewItemSortValue(value=" + this.a + ", type=" + this.b + ")";
    }
}
