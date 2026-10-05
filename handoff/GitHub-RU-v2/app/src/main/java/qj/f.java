package qj;

import androidx.work.impl.WorkDatabase_Impl;
import com.github.domain.database.GitHubDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import k71.k;
import l7.h0;
import m7.w;
import r7.g;
import r7.h;
import r7.i;
import r7.j;
import sy.d0;
import sy.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f extends h0 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ w e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
        this.e = workDatabase_Impl;
    }

    public final void a(v7.a aVar) {
        switch (this.d) {
            case 0:
                k.g(aVar, "connection");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `notification_schedules` (`id` TEXT NOT NULL, `day_of_week` INTEGER NOT NULL, `starts_at` TEXT NOT NULL, `ends_at` TEXT NOT NULL, PRIMARY KEY(`day_of_week`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `analytics_events` (`uuid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `app_element` TEXT NOT NULL, `app_action` TEXT NOT NULL, `performed_at` TEXT NOT NULL, `subject_type` TEXT, `context` TEXT)");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `recent_searches` (`query` TEXT NOT NULL, `performed_at` INTEGER NOT NULL, PRIMARY KEY(`query`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `mobile_push_notification_settings` (`push_notification_type` TEXT NOT NULL, `value` INTEGER NOT NULL, PRIMARY KEY(`push_notification_type`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `dashboard_nav_links` (`identifier` TEXT NOT NULL, `hidden` INTEGER NOT NULL, PRIMARY KEY(`identifier`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `filter_bars` (`id` TEXT NOT NULL, `filter` TEXT, `metadata` TEXT NOT NULL DEFAULT '', `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `shortcuts` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `full_query_string` TEXT NOT NULL DEFAULT '', `query` TEXT NOT NULL, `scope` TEXT NOT NULL, `type` TEXT NOT NULL, `color` TEXT NOT NULL, `icon` TEXT NOT NULL, PRIMARY KEY(`id`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `pinned_items` (`name` TEXT NOT NULL, `id` TEXT NOT NULL, `owner` TEXT NOT NULL, `avatar` TEXT NOT NULL, `url` TEXT NOT NULL, PRIMARY KEY(`id`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `deeplink_hashes` (`hash` TEXT NOT NULL, `last_seen` INTEGER NOT NULL, PRIMARY KEY(`hash`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `repository_code_searches` (`query` TEXT NOT NULL, `repo_owner_and_name` TEXT NOT NULL, `performed_at` INTEGER NOT NULL, PRIMARY KEY(`query`, `repo_owner_and_name`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `chat_threads` (`id` TEXT NOT NULL, `selected_model` TEXT, PRIMARY KEY(`id`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `ai_models` (`id` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `agent_tasks` (`task_id` TEXT NOT NULL, `task_title` TEXT NOT NULL, `task_state` TEXT NOT NULL, `task_is_draft` INTEGER NOT NULL, `task_is_queued` INTEGER NOT NULL, `task_uri` TEXT NOT NULL, `task_repo_owner` TEXT NOT NULL, `task_repo_name` TEXT NOT NULL, `task_number` INTEGER NOT NULL, `task_row_last_updated` TEXT NOT NULL, PRIMARY KEY(`task_id`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                r.q(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3d8461625f025fb48126796fa3125bd4')");
                break;
            default:
                k.g(aVar, "connection");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                r.q(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                r.q(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                r.q(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                r.q(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                r.q(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                r.q(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                r.q(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                r.q(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
        }
    }

    public final void c(v7.a aVar) {
        switch (this.d) {
            case 0:
                k.g(aVar, "connection");
                r.q(aVar, "DROP TABLE IF EXISTS `notification_schedules`");
                r.q(aVar, "DROP TABLE IF EXISTS `analytics_events`");
                r.q(aVar, "DROP TABLE IF EXISTS `recent_searches`");
                r.q(aVar, "DROP TABLE IF EXISTS `mobile_push_notification_settings`");
                r.q(aVar, "DROP TABLE IF EXISTS `dashboard_nav_links`");
                r.q(aVar, "DROP TABLE IF EXISTS `filter_bars`");
                r.q(aVar, "DROP TABLE IF EXISTS `shortcuts`");
                r.q(aVar, "DROP TABLE IF EXISTS `pinned_items`");
                r.q(aVar, "DROP TABLE IF EXISTS `deeplink_hashes`");
                r.q(aVar, "DROP TABLE IF EXISTS `repository_code_searches`");
                r.q(aVar, "DROP TABLE IF EXISTS `chat_threads`");
                r.q(aVar, "DROP TABLE IF EXISTS `ai_models`");
                r.q(aVar, "DROP TABLE IF EXISTS `agent_tasks`");
                break;
            default:
                k.g(aVar, "connection");
                r.q(aVar, "DROP TABLE IF EXISTS `Dependency`");
                r.q(aVar, "DROP TABLE IF EXISTS `WorkSpec`");
                r.q(aVar, "DROP TABLE IF EXISTS `WorkTag`");
                r.q(aVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
                r.q(aVar, "DROP TABLE IF EXISTS `WorkName`");
                r.q(aVar, "DROP TABLE IF EXISTS `WorkProgress`");
                r.q(aVar, "DROP TABLE IF EXISTS `Preference`");
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final void r(v7.a aVar) {
        switch (this.d) {
        }
        k.g(aVar, "connection");
    }

    public final void s(v7.a aVar) {
        switch (this.d) {
            case 0:
                k.g(aVar, "connection");
                ((GitHubDatabase_Impl) this.e).o(aVar);
                break;
            default:
                k.g(aVar, "connection");
                r.q(aVar, "PRAGMA foreign_keys = ON");
                this.e.o(aVar);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final void t(v7.a aVar) {
        switch (this.d) {
        }
        k.g(aVar, "connection");
    }

    public final void u(v7.a aVar) {
        switch (this.d) {
            case 0:
                k.g(aVar, "connection");
                m71.a.u(aVar);
                break;
            default:
                k.g(aVar, "connection");
                m71.a.u(aVar);
                break;
        }
    }

    public final c21.h0 v(v7.a aVar) {
        switch (this.d) {
            case 0:
                k.g(aVar, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new g(0, 1, "id", "TEXT", (String) null, true));
                linkedHashMap.put("day_of_week", new g(1, 1, "day_of_week", "INTEGER", (String) null, true));
                linkedHashMap.put("starts_at", new g(0, 1, "starts_at", "TEXT", (String) null, true));
                j jVar = new j("notification_schedules", linkedHashMap, no.a.r(linkedHashMap, "ends_at", new g(0, 1, "ends_at", "TEXT", (String) null, true)), new LinkedHashSet());
                j G = b41.b.G(aVar, "notification_schedules");
                if (!jVar.equals(G)) {
                    break;
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("uuid", new g(1, 1, "uuid", "INTEGER", (String) null, true));
                    linkedHashMap2.put("app_element", new g(0, 1, "app_element", "TEXT", (String) null, true));
                    linkedHashMap2.put("app_action", new g(0, 1, "app_action", "TEXT", (String) null, true));
                    linkedHashMap2.put("performed_at", new g(0, 1, "performed_at", "TEXT", (String) null, true));
                    linkedHashMap2.put("subject_type", new g(0, 1, "subject_type", "TEXT", (String) null, false));
                    j jVar2 = new j("analytics_events", linkedHashMap2, no.a.r(linkedHashMap2, "context", new g(0, 1, "context", "TEXT", (String) null, false)), new LinkedHashSet());
                    j G2 = b41.b.G(aVar, "analytics_events");
                    if (!jVar2.equals(G2)) {
                        break;
                    } else {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("query", new g(1, 1, "query", "TEXT", (String) null, true));
                        j jVar3 = new j("recent_searches", linkedHashMap3, no.a.r(linkedHashMap3, "performed_at", new g(0, 1, "performed_at", "INTEGER", (String) null, true)), new LinkedHashSet());
                        j G3 = b41.b.G(aVar, "recent_searches");
                        if (!jVar3.equals(G3)) {
                            break;
                        } else {
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            linkedHashMap4.put("push_notification_type", new g(1, 1, "push_notification_type", "TEXT", (String) null, true));
                            j jVar4 = new j("mobile_push_notification_settings", linkedHashMap4, no.a.r(linkedHashMap4, "value", new g(0, 1, "value", "INTEGER", (String) null, true)), new LinkedHashSet());
                            j G4 = b41.b.G(aVar, "mobile_push_notification_settings");
                            if (!jVar4.equals(G4)) {
                                break;
                            } else {
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                linkedHashMap5.put("identifier", new g(1, 1, "identifier", "TEXT", (String) null, true));
                                j jVar5 = new j("dashboard_nav_links", linkedHashMap5, no.a.r(linkedHashMap5, "hidden", new g(0, 1, "hidden", "INTEGER", (String) null, true)), new LinkedHashSet());
                                j G5 = b41.b.G(aVar, "dashboard_nav_links");
                                if (!jVar5.equals(G5)) {
                                    break;
                                } else {
                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                    linkedHashMap6.put("id", new g(1, 1, "id", "TEXT", (String) null, true));
                                    linkedHashMap6.put("filter", new g(0, 1, "filter", "TEXT", (String) null, false));
                                    linkedHashMap6.put("metadata", new g(0, 1, "metadata", "TEXT", "''", true));
                                    j jVar6 = new j("filter_bars", linkedHashMap6, no.a.r(linkedHashMap6, "timestamp", new g(0, 1, "timestamp", "INTEGER", (String) null, true)), new LinkedHashSet());
                                    j G6 = b41.b.G(aVar, "filter_bars");
                                    if (!jVar6.equals(G6)) {
                                        break;
                                    } else {
                                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                        linkedHashMap7.put("id", new g(1, 1, "id", "TEXT", (String) null, true));
                                        linkedHashMap7.put("name", new g(0, 1, "name", "TEXT", (String) null, true));
                                        linkedHashMap7.put("full_query_string", new g(0, 1, "full_query_string", "TEXT", "''", true));
                                        linkedHashMap7.put("query", new g(0, 1, "query", "TEXT", (String) null, true));
                                        linkedHashMap7.put("scope", new g(0, 1, "scope", "TEXT", (String) null, true));
                                        linkedHashMap7.put("type", new g(0, 1, "type", "TEXT", (String) null, true));
                                        linkedHashMap7.put("color", new g(0, 1, "color", "TEXT", (String) null, true));
                                        j jVar7 = new j("shortcuts", linkedHashMap7, no.a.r(linkedHashMap7, "icon", new g(0, 1, "icon", "TEXT", (String) null, true)), new LinkedHashSet());
                                        j G7 = b41.b.G(aVar, "shortcuts");
                                        if (!jVar7.equals(G7)) {
                                            break;
                                        } else {
                                            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                                            linkedHashMap8.put("name", new g(0, 1, "name", "TEXT", (String) null, true));
                                            linkedHashMap8.put("id", new g(1, 1, "id", "TEXT", (String) null, true));
                                            linkedHashMap8.put("owner", new g(0, 1, "owner", "TEXT", (String) null, true));
                                            linkedHashMap8.put("avatar", new g(0, 1, "avatar", "TEXT", (String) null, true));
                                            j jVar8 = new j("pinned_items", linkedHashMap8, no.a.r(linkedHashMap8, "url", new g(0, 1, "url", "TEXT", (String) null, true)), new LinkedHashSet());
                                            j G8 = b41.b.G(aVar, "pinned_items");
                                            if (!jVar8.equals(G8)) {
                                                break;
                                            } else {
                                                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                                                linkedHashMap9.put("hash", new g(1, 1, "hash", "TEXT", (String) null, true));
                                                j jVar9 = new j("deeplink_hashes", linkedHashMap9, no.a.r(linkedHashMap9, "last_seen", new g(0, 1, "last_seen", "INTEGER", (String) null, true)), new LinkedHashSet());
                                                j G9 = b41.b.G(aVar, "deeplink_hashes");
                                                if (!jVar9.equals(G9)) {
                                                    break;
                                                } else {
                                                    LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                                                    linkedHashMap10.put("query", new g(1, 1, "query", "TEXT", (String) null, true));
                                                    linkedHashMap10.put("repo_owner_and_name", new g(2, 1, "repo_owner_and_name", "TEXT", (String) null, true));
                                                    j jVar10 = new j("repository_code_searches", linkedHashMap10, no.a.r(linkedHashMap10, "performed_at", new g(0, 1, "performed_at", "INTEGER", (String) null, true)), new LinkedHashSet());
                                                    j G10 = b41.b.G(aVar, "repository_code_searches");
                                                    if (!jVar10.equals(G10)) {
                                                        break;
                                                    } else {
                                                        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                                                        linkedHashMap11.put("id", new g(1, 1, "id", "TEXT", (String) null, true));
                                                        j jVar11 = new j("chat_threads", linkedHashMap11, no.a.r(linkedHashMap11, "selected_model", new g(0, 1, "selected_model", "TEXT", (String) null, false)), new LinkedHashSet());
                                                        j G11 = b41.b.G(aVar, "chat_threads");
                                                        if (!jVar11.equals(G11)) {
                                                            break;
                                                        } else {
                                                            LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                                                            linkedHashMap12.put("id", new g(1, 1, "id", "TEXT", (String) null, true));
                                                            j jVar12 = new j("ai_models", linkedHashMap12, no.a.r(linkedHashMap12, "updated_at", new g(0, 1, "updated_at", "INTEGER", (String) null, true)), new LinkedHashSet());
                                                            j G12 = b41.b.G(aVar, "ai_models");
                                                            if (!jVar12.equals(G12)) {
                                                                break;
                                                            } else {
                                                                LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                                                                linkedHashMap13.put("task_id", new g(1, 1, "task_id", "TEXT", (String) null, true));
                                                                linkedHashMap13.put("task_title", new g(0, 1, "task_title", "TEXT", (String) null, true));
                                                                linkedHashMap13.put("task_state", new g(0, 1, "task_state", "TEXT", (String) null, true));
                                                                linkedHashMap13.put("task_is_draft", new g(0, 1, "task_is_draft", "INTEGER", (String) null, true));
                                                                linkedHashMap13.put("task_is_queued", new g(0, 1, "task_is_queued", "INTEGER", (String) null, true));
                                                                linkedHashMap13.put("task_uri", new g(0, 1, "task_uri", "TEXT", (String) null, true));
                                                                linkedHashMap13.put("task_repo_owner", new g(0, 1, "task_repo_owner", "TEXT", (String) null, true));
                                                                linkedHashMap13.put("task_repo_name", new g(0, 1, "task_repo_name", "TEXT", (String) null, true));
                                                                linkedHashMap13.put("task_number", new g(0, 1, "task_number", "INTEGER", (String) null, true));
                                                                j jVar13 = new j("agent_tasks", linkedHashMap13, no.a.r(linkedHashMap13, "task_row_last_updated", new g(0, 1, "task_row_last_updated", "TEXT", (String) null, true)), new LinkedHashSet());
                                                                j G13 = b41.b.G(aVar, "agent_tasks");
                                                                if (!jVar13.equals(G13)) {
                                                                    break;
                                                                } else {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            default:
                k.g(aVar, "connection");
                LinkedHashMap linkedHashMap14 = new LinkedHashMap();
                linkedHashMap14.put("work_spec_id", new g(1, 1, "work_spec_id", "TEXT", (String) null, true));
                LinkedHashSet r = no.a.r(linkedHashMap14, "prerequisite_id", new g(2, 1, "prerequisite_id", "TEXT", (String) null, true));
                r.add(new h("WorkSpec", "CASCADE", "CASCADE", d0.n("work_spec_id"), d0.n("id")));
                r.add(new h("WorkSpec", "CASCADE", "CASCADE", d0.n("prerequisite_id"), d0.n("id")));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new i("index_Dependency_work_spec_id", d0.n("work_spec_id"), d0.n("ASC"), false));
                linkedHashSet.add(new i("index_Dependency_prerequisite_id", d0.n("prerequisite_id"), d0.n("ASC"), false));
                j jVar14 = new j("Dependency", linkedHashMap14, r, linkedHashSet);
                j G14 = b41.b.G(aVar, "Dependency");
                if (!jVar14.equals(G14)) {
                    break;
                } else {
                    LinkedHashMap linkedHashMap15 = new LinkedHashMap();
                    linkedHashMap15.put("id", new g(1, 1, "id", "TEXT", (String) null, true));
                    linkedHashMap15.put("state", new g(0, 1, "state", "INTEGER", (String) null, true));
                    linkedHashMap15.put("worker_class_name", new g(0, 1, "worker_class_name", "TEXT", (String) null, true));
                    linkedHashMap15.put("input_merger_class_name", new g(0, 1, "input_merger_class_name", "TEXT", (String) null, true));
                    linkedHashMap15.put("input", new g(0, 1, "input", "BLOB", (String) null, true));
                    linkedHashMap15.put("output", new g(0, 1, "output", "BLOB", (String) null, true));
                    linkedHashMap15.put("initial_delay", new g(0, 1, "initial_delay", "INTEGER", (String) null, true));
                    linkedHashMap15.put("interval_duration", new g(0, 1, "interval_duration", "INTEGER", (String) null, true));
                    linkedHashMap15.put("flex_duration", new g(0, 1, "flex_duration", "INTEGER", (String) null, true));
                    linkedHashMap15.put("run_attempt_count", new g(0, 1, "run_attempt_count", "INTEGER", (String) null, true));
                    linkedHashMap15.put("backoff_policy", new g(0, 1, "backoff_policy", "INTEGER", (String) null, true));
                    linkedHashMap15.put("backoff_delay_duration", new g(0, 1, "backoff_delay_duration", "INTEGER", (String) null, true));
                    linkedHashMap15.put("last_enqueue_time", new g(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
                    linkedHashMap15.put("minimum_retention_duration", new g(0, 1, "minimum_retention_duration", "INTEGER", (String) null, true));
                    linkedHashMap15.put("schedule_requested_at", new g(0, 1, "schedule_requested_at", "INTEGER", (String) null, true));
                    linkedHashMap15.put("run_in_foreground", new g(0, 1, "run_in_foreground", "INTEGER", (String) null, true));
                    linkedHashMap15.put("out_of_quota_policy", new g(0, 1, "out_of_quota_policy", "INTEGER", (String) null, true));
                    linkedHashMap15.put("period_count", new g(0, 1, "period_count", "INTEGER", "0", true));
                    linkedHashMap15.put("generation", new g(0, 1, "generation", "INTEGER", "0", true));
                    linkedHashMap15.put("next_schedule_time_override", new g(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
                    linkedHashMap15.put("next_schedule_time_override_generation", new g(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
                    linkedHashMap15.put("stop_reason", new g(0, 1, "stop_reason", "INTEGER", "-256", true));
                    linkedHashMap15.put("trace_tag", new g(0, 1, "trace_tag", "TEXT", (String) null, false));
                    linkedHashMap15.put("backoff_on_system_interruptions", new g(0, 1, "backoff_on_system_interruptions", "INTEGER", (String) null, false));
                    linkedHashMap15.put("required_network_type", new g(0, 1, "required_network_type", "INTEGER", (String) null, true));
                    linkedHashMap15.put("required_network_request", new g(0, 1, "required_network_request", "BLOB", "x''", true));
                    linkedHashMap15.put("requires_charging", new g(0, 1, "requires_charging", "INTEGER", (String) null, true));
                    linkedHashMap15.put("requires_device_idle", new g(0, 1, "requires_device_idle", "INTEGER", (String) null, true));
                    linkedHashMap15.put("requires_battery_not_low", new g(0, 1, "requires_battery_not_low", "INTEGER", (String) null, true));
                    linkedHashMap15.put("requires_storage_not_low", new g(0, 1, "requires_storage_not_low", "INTEGER", (String) null, true));
                    linkedHashMap15.put("trigger_content_update_delay", new g(0, 1, "trigger_content_update_delay", "INTEGER", (String) null, true));
                    linkedHashMap15.put("trigger_max_content_delay", new g(0, 1, "trigger_max_content_delay", "INTEGER", (String) null, true));
                    LinkedHashSet r2 = no.a.r(linkedHashMap15, "content_uri_triggers", new g(0, 1, "content_uri_triggers", "BLOB", (String) null, true));
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    linkedHashSet2.add(new i("index_WorkSpec_schedule_requested_at", d0.n("schedule_requested_at"), d0.n("ASC"), false));
                    linkedHashSet2.add(new i("index_WorkSpec_last_enqueue_time", d0.n("last_enqueue_time"), d0.n("ASC"), false));
                    j jVar15 = new j("WorkSpec", linkedHashMap15, r2, linkedHashSet2);
                    j G15 = b41.b.G(aVar, "WorkSpec");
                    if (!jVar15.equals(G15)) {
                        break;
                    } else {
                        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
                        linkedHashMap16.put("tag", new g(1, 1, "tag", "TEXT", (String) null, true));
                        LinkedHashSet r3 = no.a.r(linkedHashMap16, "work_spec_id", new g(2, 1, "work_spec_id", "TEXT", (String) null, true));
                        r3.add(new h("WorkSpec", "CASCADE", "CASCADE", d0.n("work_spec_id"), d0.n("id")));
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        linkedHashSet3.add(new i("index_WorkTag_work_spec_id", d0.n("work_spec_id"), d0.n("ASC"), false));
                        j jVar16 = new j("WorkTag", linkedHashMap16, r3, linkedHashSet3);
                        j G16 = b41.b.G(aVar, "WorkTag");
                        if (!jVar16.equals(G16)) {
                            break;
                        } else {
                            LinkedHashMap linkedHashMap17 = new LinkedHashMap();
                            linkedHashMap17.put("work_spec_id", new g(1, 1, "work_spec_id", "TEXT", (String) null, true));
                            linkedHashMap17.put("generation", new g(2, 1, "generation", "INTEGER", "0", true));
                            LinkedHashSet r4 = no.a.r(linkedHashMap17, "system_id", new g(0, 1, "system_id", "INTEGER", (String) null, true));
                            r4.add(new h("WorkSpec", "CASCADE", "CASCADE", d0.n("work_spec_id"), d0.n("id")));
                            j jVar17 = new j("SystemIdInfo", linkedHashMap17, r4, new LinkedHashSet());
                            j G17 = b41.b.G(aVar, "SystemIdInfo");
                            if (!jVar17.equals(G17)) {
                                break;
                            } else {
                                LinkedHashMap linkedHashMap18 = new LinkedHashMap();
                                linkedHashMap18.put("name", new g(1, 1, "name", "TEXT", (String) null, true));
                                LinkedHashSet r5 = no.a.r(linkedHashMap18, "work_spec_id", new g(2, 1, "work_spec_id", "TEXT", (String) null, true));
                                r5.add(new h("WorkSpec", "CASCADE", "CASCADE", d0.n("work_spec_id"), d0.n("id")));
                                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                linkedHashSet4.add(new i("index_WorkName_work_spec_id", d0.n("work_spec_id"), d0.n("ASC"), false));
                                j jVar18 = new j("WorkName", linkedHashMap18, r5, linkedHashSet4);
                                j G18 = b41.b.G(aVar, "WorkName");
                                if (!jVar18.equals(G18)) {
                                    break;
                                } else {
                                    LinkedHashMap linkedHashMap19 = new LinkedHashMap();
                                    linkedHashMap19.put("work_spec_id", new g(1, 1, "work_spec_id", "TEXT", (String) null, true));
                                    LinkedHashSet r6 = no.a.r(linkedHashMap19, "progress", new g(0, 1, "progress", "BLOB", (String) null, true));
                                    r6.add(new h("WorkSpec", "CASCADE", "CASCADE", d0.n("work_spec_id"), d0.n("id")));
                                    j jVar19 = new j("WorkProgress", linkedHashMap19, r6, new LinkedHashSet());
                                    j G19 = b41.b.G(aVar, "WorkProgress");
                                    if (!jVar19.equals(G19)) {
                                        break;
                                    } else {
                                        LinkedHashMap linkedHashMap20 = new LinkedHashMap();
                                        linkedHashMap20.put("key", new g(1, 1, "key", "TEXT", (String) null, true));
                                        j jVar20 = new j("Preference", linkedHashMap20, no.a.r(linkedHashMap20, "long_value", new g(0, 1, "long_value", "INTEGER", (String) null, false)), new LinkedHashSet());
                                        j G20 = b41.b.G(aVar, "Preference");
                                        if (!jVar20.equals(G20)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
        }
        return new c21.h0((String) null, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(GitHubDatabase_Impl gitHubDatabase_Impl) {
        super("3d8461625f025fb48126796fa3125bd4", 18, "c3a7dcb98b57baa921834fd1e79bd210");
        this.e = gitHubDatabase_Impl;
    }

}
