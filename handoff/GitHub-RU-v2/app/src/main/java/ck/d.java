package ck;

import d9.q;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import sy.t;
import v8.f0;
import v8.i;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d extends l0 {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    public final void l(v7.c cVar, Object obj) {
        int i;
        int i2 = 1;
        switch (this.a) {
            case 0:
                h hVar = (h) obj;
                k.g(cVar, "statement");
                k.g(hVar, "entity");
                cVar.k0(hVar.a, 1);
                return;
            case 1:
                q qVar = (q) obj;
                k.g(cVar, "statement");
                k.g(qVar, "entity");
                String str = qVar.a;
                cVar.k0(str, 1);
                cVar.c(2, b41.b.M(qVar.b));
                cVar.k0(qVar.c, 3);
                cVar.k0(qVar.d, 4);
                i iVar = i.b;
                cVar.d(5, t.r(qVar.e));
                cVar.d(6, t.r(qVar.f));
                cVar.c(7, qVar.g);
                cVar.c(8, qVar.h);
                cVar.c(9, qVar.i);
                cVar.c(10, qVar.k);
                v8.a aVar = qVar.l;
                k.g(aVar, "backoffPolicy");
                int ordinal = aVar.ordinal();
                if (ordinal == 0) {
                    i = 0;
                } else {
                    if (ordinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 1;
                }
                cVar.c(11, i);
                cVar.c(12, qVar.m);
                cVar.c(13, qVar.n);
                cVar.c(14, qVar.o);
                cVar.c(15, qVar.p);
                cVar.c(16, qVar.q ? 1L : 0L);
                f0 f0Var = qVar.r;
                k.g(f0Var, "policy");
                int ordinal2 = f0Var.ordinal();
                if (ordinal2 == 0) {
                    i2 = 0;
                } else if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar.c(17, i2);
                cVar.c(18, qVar.s);
                cVar.c(19, qVar.t);
                cVar.c(20, qVar.u);
                cVar.c(21, qVar.v);
                cVar.c(22, qVar.w);
                String str2 = qVar.x;
                if (str2 == null) {
                    cVar.g(23);
                } else {
                    cVar.k0(str2, 23);
                }
                Boolean bool = qVar.y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    cVar.g(24);
                } else {
                    cVar.c(24, r1.intValue());
                }
                v8.f fVar = qVar.j;
                cVar.c(25, b41.b.E(fVar.a));
                cVar.d(26, b41.b.t(fVar.b));
                cVar.c(27, fVar.c ? 1L : 0L);
                cVar.c(28, fVar.d ? 1L : 0L);
                cVar.c(29, fVar.e ? 1L : 0L);
                cVar.c(30, fVar.f ? 1L : 0L);
                cVar.c(31, fVar.g);
                cVar.c(32, fVar.h);
                cVar.d(33, b41.b.J(fVar.i));
                cVar.k0(str, 34);
                return;
            case 2:
                vj.d dVar = (vj.d) obj;
                k.g(cVar, "statement");
                k.g(dVar, "entity");
                cVar.k0(dVar.a, 1);
                return;
            case 3:
                k.g(cVar, "statement");
                k.g((wj.e) obj, "entity");
                cVar.c(1, r9.a);
                return;
            default:
                xj.e eVar = (xj.e) obj;
                k.g(cVar, "statement");
                k.g(eVar, "entity");
                cVar.k0(eVar.a, 1);
                return;
        }
    }

    public final String n() {
        switch (this.a) {
            case 0:
                return "DELETE FROM `recent_searches` WHERE `query` = ?";
            case 1:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            case 2:
                return "DELETE FROM `deeplink_hashes` WHERE `hash` = ?";
            case 3:
                return "DELETE FROM `analytics_events` WHERE `uuid` = ?";
            default:
                return "DELETE FROM `filter_bars` WHERE `id` = ?";
        }
    }
    public Object z(Object p1, Object p2) { return null; }
}
