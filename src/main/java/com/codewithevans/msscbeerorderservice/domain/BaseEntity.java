package com.codewithevans.msscbeerorderservice.domain;

import lombok.*;
import org.hibernate.annotations.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {

    public BaseEntity(UUID id, Long version, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Type(type="org.hibernate.type.UUIDCharType")
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false )
    private UUID id;

    @Version
    private Long version;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

    public boolean isNew() {
        return this.id == null;
    }
}
