package ak;

import ck.h;
import com.github.rudroid.common.g;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.home.NavLinkIdentifier;
import d9.f;
import d9.j;
import d9.q;
import d9.u;
import java.time.LocalTime;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import sy.tShadow;
import v8.f0;
import v8.i;
import w8.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends s {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    public final void g(v7.c cVar, Object obj) {
        int i;
        int i2 = 1;
        switch (this.a) {
            case 0:
                e eVar = (e) obj;
                k.g(cVar, "statement");
                k.g(eVar, "entity");
                a aVar = eVar.a;
                k.g(aVar, "value");
                cVar.k0(aVar.r, 1);
                cVar.c(2, eVar.b ? 1L : 0L);
                return;
            case 1:
                bk.c cVar2 = (bk.c) obj;
                k.g(cVar, "statement");
                k.g(cVar2, "entity");
                cVar.k0(cVar2.a, 1);
                cVar.k0(cVar2.b, 2);
                cVar.k0(cVar2.c, 3);
                Avatar avatar = cVar2.d;
                k.g(avatar, "avatar");
                l81.b bVar = l81.c.d;
                bVar.getClass();
                cVar.k0(bVar.b(Avatar.Companion.serializer(), avatar), 4);
                cVar.k0(cVar2.e, 5);
                return;
            case 2:
                h hVar = (h) obj;
                k.g(cVar, "statement");
                k.g(hVar, "entity");
                cVar.k0(hVar.a, 1);
                cVar.c(2, hVar.b);
                return;
            case 3:
                d9.a aVar2 = (d9.a) obj;
                k.g(cVar, "statement");
                k.g(aVar2, "entity");
                cVar.k0(aVar2.a, 1);
                cVar.k0(aVar2.b, 2);
                return;
            case 4:
                d9.c cVar3 = (d9.c) obj;
                k.g(cVar, "statement");
                k.g(cVar3, "entity");
                cVar.k0(cVar3.a, 1);
                cVar.c(2, cVar3.b.longValue());
                return;
            case 5:
                f fVar = (f) obj;
                k.g(cVar, "statement");
                k.g(fVar, "entity");
                cVar.k0(fVar.a, 1);
                cVar.c(2, fVar.b);
                cVar.c(3, fVar.c);
                return;
            case 6:
                j jVar = (j) obj;
                k.g(cVar, "statement");
                k.g(jVar, "entity");
                cVar.k0(jVar.a, 1);
                cVar.k0(jVar.b, 2);
                return;
            case 7:
                q qVar = (q) obj;
                k.g(cVar, "statement");
                k.g(qVar, "entity");
                cVar.k0(qVar.a, 1);
                cVar.c(2, b41.b.M(qVar.b));
                cVar.k0(qVar.c, 3);
                cVar.k0(qVar.d, 4);
                i iVar = i.b;
                cVar.d(5, tShadow.r(qVar.e));
                cVar.d(6, tShadow.r(qVar.f));
                cVar.c(7, qVar.g);
                cVar.c(8, qVar.h);
                cVar.c(9, qVar.i);
                cVar.c(10, qVar.k);
                v8.a aVar3 = qVar.l;
                k.g(aVar3, "backoffPolicy");
                int ordinal = aVar3.ordinal();
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
                String str = qVar.x;
                if (str == null) {
                    cVar.g(23);
                } else {
                    cVar.k0(str, 23);
                }
                Boolean bool = qVar.y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    cVar.g(24);
                } else {
                    cVar.c(24, r3.intValue());
                }
                v8.f fVar2 = qVar.j;
                cVar.c(25, b41.b.E(fVar2.a));
                cVar.d(26, b41.b.t(fVar2.b));
                cVar.c(27, fVar2.c ? 1L : 0L);
                cVar.c(28, fVar2.d ? 1L : 0L);
                cVar.c(29, fVar2.e ? 1L : 0L);
                cVar.c(30, fVar2.f ? 1L : 0L);
                cVar.c(31, fVar2.g);
                cVar.c(32, fVar2.h);
                cVar.d(33, b41.b.J(fVar2.i));
                return;
            case 8:
                u uVar = (u) obj;
                k.g(cVar, "statement");
                k.g(uVar, "entity");
                cVar.k0(uVar.a, 1);
                cVar.k0(uVar.b, 2);
                return;
            case 9:
                dk.e eVar2 = (dk.e) obj;
                k.g(cVar, "statement");
                k.g(eVar2, "entity");
                cVar.k0(eVar2.a, 1);
                cVar.k0(eVar2.b, 2);
                cVar.c(3, eVar2.c);
                return;
            case 10:
                sj.b bVar2 = (sj.b) obj;
                k.g(cVar, "statement");
                k.g(bVar2, "entity");
                cVar.k0(bVar2.a, 1);
                cVar.k0(bVar2.b, 2);
                cVar.k0(bVar2.c, 3);
                cVar.c(4, bVar2.d ? 1L : 0L);
                cVar.c(5, bVar2.e ? 1L : 0L);
                cVar.k0(bVar2.f, 6);
                cVar.k0(bVar2.g, 7);
                cVar.k0(bVar2.h, 8);
                cVar.c(9, bVar2.i);
                cVar.k0(bVar2.j, 10);
                return;
            case 11:
                tj.a aVar4 = (tj.a) obj;
                k.g(cVar, "statement");
                k.g(aVar4, "entity");
                cVar.k0(aVar4.a, 1);
                String str2 = aVar4.b;
                if (str2 == null) {
                    cVar.g(2);
                    return;
                } else {
                    cVar.k0(str2, 2);
                    return;
                }
            case 12:
                uj.c cVar4 = (uj.c) obj;
                k.g(cVar, "statement");
                k.g(cVar4, "entity");
                NavLinkIdentifier navLinkIdentifier = cVar4.a;
                k.g(navLinkIdentifier, "value");
                cVar.k0(navLinkIdentifier.getRawValue(), 1);
                cVar.c(2, cVar4.b ? 1L : 0L);
                return;
            case 13:
                vj.d dVar = (vj.d) obj;
                k.g(cVar, "statement");
                k.g(dVar, "entity");
                cVar.k0(dVar.a, 1);
                cVar.c(2, dVar.b);
                return;
            case 14:
                wj.e eVar3 = (wj.e) obj;
                k.g(cVar, "statement");
                k.g(eVar3, "entity");
                cVar.c(1, eVar3.a);
                cVar.k0(eVar3.b, 2);
                cVar.k0(eVar3.c, 3);
                cVar.k0(eVar3.d, 4);
                String str3 = eVar3.e;
                if (str3 == null) {
                    cVar.g(5);
                } else {
                    cVar.k0(str3, 5);
                }
                String str4 = eVar3.f;
                if (str4 == null) {
                    cVar.g(6);
                    return;
                } else {
                    cVar.k0(str4, 6);
                    return;
                }
            case 15:
                xj.e eVar4 = (xj.e) obj;
                k.g(cVar, "statement");
                k.g(eVar4, "entity");
                cVar.k0(eVar4.a, 1);
                String str5 = eVar4.b;
                if (str5 == null) {
                    cVar.g(2);
                } else {
                    cVar.k0(str5, 2);
                }
                cVar.k0(eVar4.c, 3);
                cVar.c(4, eVar4.d);
                return;
            case 16:
                yj.a aVar5 = (yj.a) obj;
                k.g(cVar, "statement");
                k.g(aVar5, "entity");
                cVar.k0(aVar5.a, 1);
                cVar.c(2, aVar5.b);
                return;
            default:
                zj.d dVar2 = (zj.d) obj;
                k.g(cVar, "statement");
                k.g(dVar2, "entity");
                cVar.k0(dVar2.a, 1);
                k.g(dVar2.b, "daysOfWeek");
                cVar.c(2, g.a(r3));
                LocalTime localTime = dVar2.c;
                k.g(localTime, "date");
                String localTime2 = localTime.toString();
                k.f(localTime2, "toString(...)");
                cVar.k0(localTime2, 3);
                LocalTime localTime3 = dVar2.d;
                k.g(localTime3, "date");
                String localTime4 = localTime3.toString();
                k.f(localTime4, "toString(...)");
                cVar.k0(localTime4, 4);
                return;
        }
    }

    public final String k() {
        switch (this.a) {
            case 0:
                return "INSERT OR REPLACE INTO `mobile_push_notification_settings` (`push_notification_type`,`value`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `pinned_items` (`name`,`id`,`owner`,`avatar`,`url`) VALUES (?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `recent_searches` (`query`,`performed_at`) VALUES (?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 6:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 7:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `repository_code_searches` (`query`,`repo_owner_and_name`,`performed_at`) VALUES (?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `agent_tasks` (`task_id`,`task_title`,`task_state`,`task_is_draft`,`task_is_queued`,`task_uri`,`task_repo_owner`,`task_repo_name`,`task_number`,`task_row_last_updated`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `chat_threads` (`id`,`selected_model`) VALUES (?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `dashboard_nav_links` (`identifier`,`hidden`) VALUES (?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `deeplink_hashes` (`hash`,`last_seen`) VALUES (?,?)";
            case 14:
                return "INSERT OR ABORT INTO `analytics_events` (`uuid`,`app_element`,`app_action`,`performed_at`,`subject_type`,`context`) VALUES (nullif(?, 0),?,?,?,?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `filter_bars` (`id`,`filter`,`metadata`,`timestamp`) VALUES (?,?,?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `ai_models` (`id`,`updated_at`) VALUES (?,?)";
            default:
                return "INSERT OR REPLACE INTO `notification_schedules` (`id`,`day_of_week`,`starts_at`,`ends_at`) VALUES (?,?,?,?)";
        }
    }
}
