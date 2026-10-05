package mn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.WorkflowRunEvent;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final ZonedDateTime e;
    public final WorkflowRunEvent f;
    public final s g;
    public final String h;
    public final String i;
    public final t j;

    public u(String str, String str2, int i, String str3, ZonedDateTime zonedDateTime, WorkflowRunEvent workflowRunEvent, s sVar, String str4, String str5, t tVar) {
        k71.k.g(str, "id");
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(workflowRunEvent, "event");
        k71.k.g(str4, "workflowName");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = zonedDateTime;
        this.f = workflowRunEvent;
        this.g = sVar;
        this.h = str4;
        this.i = str5;
        this.j = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && this.c == uVar.c && k71.k.b(this.d, uVar.d) && k71.k.b(this.e, uVar.e) && this.f == uVar.f && k71.k.b(this.g, uVar.g) && k71.k.b(this.h, uVar.h) && k71.k.b(this.i, uVar.i) && k71.k.b(this.j, uVar.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = s0.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.d;
        int i = h1.i((this.g.hashCode() + ((this.f.hashCode() + m0.a(this.e, (b + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31)) * 31, this.h, 31);
        String str3 = this.i;
        return this.j.hashCode() + ((i + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("WorkflowRun(id=", this.a, ", title=", this.b, ", runNumber=");
        x.i.r(this.c, ", branchName=", this.d, ", createdAt=", o);
        o.append(this.e);
        o.append(", event=");
        o.append(this.f);
        o.append(", checkSuiteInfo=");
        o.append(this.g);
        o.append(", workflowName=");
        o.append(this.h);
        o.append(", workflowFilePath=");
        o.append(this.i);
        o.append(", repositoryInfo=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }
}
