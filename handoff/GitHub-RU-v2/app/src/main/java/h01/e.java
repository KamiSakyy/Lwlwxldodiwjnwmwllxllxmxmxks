package h01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.agents.AgentAssignment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public class e {
    public String a;
    public String b;
    public String c;
    public String d;
    public List e;
    public String f;
    public List g;
    public String h;
    public String i;
    public List j;
    public AgentAssignment k;

    public e(String str, String str2, String str3, String str4, ArrayList arrayList, String str5, ArrayList arrayList2, String str6, String str7, ArrayList arrayList3, AgentAssignment agentAssignment) {
        k71.k.g(str, "repositoryId");
        k71.k.g(str2, "title");
        k71.k.g(str3, "body");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = str5;
        this.g = arrayList2;
        this.h = str6;
        this.i = str7;
        this.j = arrayList3;
        this.k = agentAssignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c) && k71.k.b(this.d, eVar.d) && k71.k.b(this.e, eVar.e) && k71.k.b(this.f, eVar.f) && k71.k.b(this.g, eVar.g) && k71.k.b(this.h, eVar.h) && k71.k.b(this.i, eVar.i) && k71.k.b(this.j, eVar.j) && k71.k.b(this.k, eVar.k);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.e;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.g;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list3 = this.j;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AgentAssignment agentAssignment = this.k;
        return hashCode7 + (agentAssignment != null ? agentAssignment.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("CreateIssueInput(repositoryId=", this.a, ", title=", this.b, ", body=");
        f1.e.x(o, this.c, ", parentIssueId=", this.d, ", assigneeIds=");
        o.append(this.e);
        o.append(", milestoneId=");
        o.append(this.f);
        o.append(", labelIds=");
        o.append(this.g);
        o.append(", issueTypeId=");
        o.append(this.h);
        o.append(", issueTemplate=");
        o.append(this.i);
        o.append(", projectV2Ids=");
        o.append(this.j);
        o.append(", agentAssignment=");
        o.append(this.k);
        o.append(")");
        return o.toString();
    }
    public static Object c(Object p1, Object p2, Object p3) { return null; }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
