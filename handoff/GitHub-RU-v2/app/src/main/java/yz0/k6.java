package yz0;

import com.github.service.models.response.DeploymentStatusState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k6 extends s7 {
    public final String a;
    public final String b;
    public final DeploymentStatusState c;
    public final ZonedDateTime d;

    public k6(String str, String str2, DeploymentStatusState deploymentStatusState, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "actorDisplayName");
        k71.k.g(deploymentStatusState, "state");
        this.a = str;
        this.b = str2;
        this.c = deploymentStatusState;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return k71.k.b(this.a, k6Var.a) && k71.k.b(this.b, k6Var.b) && this.c == k6Var.c && k71.k.b(this.d, k6Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineDeploymentEnvironmentChangedEvent(actorDisplayName=", this.a, ", newEnvironment=", this.b, ", state=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
