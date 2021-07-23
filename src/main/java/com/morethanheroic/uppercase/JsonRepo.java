package com.morethanheroic.uppercase;

import org.springframework.data.repository.CrudRepository;

public interface JsonRepo extends CrudRepository<MessageJson, Long> {
}
