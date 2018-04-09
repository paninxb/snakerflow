/* Copyright 2013-2015 www.snakerflow.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.engine.entity;

import com.tuisitang.modules.persist.persistence.AbstractEntity;

/**
 * 任务参与者实体类
 * 
 * @author yuqs
 * @since 1.0
 */
public class TaskActor<T> extends AbstractEntity<T> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 关联的任务ID
     */
    protected String taskId;
    /**
     * 关联的参与者ID（参与者可以为用户、部门、角色）
     */
    protected String actorId;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    @Override
    public void preInsert() {
         
    }

    @Override
    public void preUpdate() {
         
    }
}
