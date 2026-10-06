package yz0;

import com.github.service.models.response.DeploymentState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j6 extends s7 {
    public final String a;
    public final String b;
    public final DeploymentState c;
    public final ZonedDateTime d;

    public j6(String str, String str2, DeploymentState deploymentState, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "actorDisplayName");
        this.a = str;
        this.b = str2;
        this.c = deploymentState;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return k71.k.b(this.a, j6Var.a) && k71.k.b(this.b, j6Var.b) && this.c == j6Var.c && k71.k.b(this.d, j6Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeploymentState deploymentState = this.c;
        return this.d.hashCode() + ((hashCode2 + (deploymentState != null ? deploymentState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineDeployedEvent(actorDisplayName=", this.a, ", environment=", this.b, ", state=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
