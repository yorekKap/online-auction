package com.auction.persistence.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.auction.config.PersistenceConfig;
import com.auction.domain.Item;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class})
public class ItemRepositoryTest extends TestCase {

	@Autowired
	ItemRepository itemRepository;

	@Test
	public void shouldPersistItem(){
		Item item = new Item();
		item.setTitle("New item");
		item.setDescription("New is good");
		itemRepository.save(item);

		System.out.println(itemRepository.findAll().get(0).toString());
	}

}
