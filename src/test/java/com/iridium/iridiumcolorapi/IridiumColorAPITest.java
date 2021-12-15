package com.iridium.iridiumcolorapi;

import org.bukkit.Bukkit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IridiumColorAPITest {

    static MockedStatic<Bukkit> mockedStatic;

    @BeforeAll
    static void setup() {
        mockedStatic = Mockito.mockStatic(Bukkit.class);
        mockedStatic.when(Bukkit::getVersion).thenReturn("1.17.1-R0.1-SNAPSHOT");
    }

    @Test
    void process() {

        assertEquals("§x§1§2§3§4§5§6Test", IridiumColorAPI.process("<SOLID:123456>Test"));
        assertEquals("§x§1§2§3§4§5§6Te§kst", IridiumColorAPI.process("<SOLID:123456>Te&kst"));
        assertEquals("§x§2§c§0§8§b§a§lT§x§1§e§3§3§a§f§le§x§1§0§5§e§a§4§ls§x§0§2§8§9§9§9§lt", IridiumColorAPI.process("<GRADIENT:2C08BA>&lTest</GRADIENT:028A97>"));
        assertEquals("§x§2§c§0§8§b§a§lT§x§1§e§3§3§a§f§le§x§1§0§5§e§a§4§ls§x§0§2§8§9§9§9§l§kt", IridiumColorAPI.process("<GRADIENT:2C08BA>&lTes§kt</GRADIENT:028A97>"));
        assertEquals("§x§f§f§0§0§0§0§lT§x§8§0§f§f§0§0§le§x§0§0§f§f§f§f§ls§x§8§0§0§0§f§f§lt", IridiumColorAPI.process("<RAINBOW1>&lTest</RAINBOW>"));
        assertEquals("§x§f§f§0§0§0§0§lT§x§8§0§f§f§0§0§le§x§0§0§f§f§f§f§ls§x§8§0§0§0§f§f§l§kt", IridiumColorAPI.process("<RAINBOW1>&lTes&kt</RAINBOW>"));
        assertEquals("§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*", IridiumColorAPI.process("<GRADIENT:123456>******************************************************************************************************************************************************************************************************</GRADIENT:ABCDEF>"));
    }

    @Test
    void listProcess() {
        List<String> list = Arrays.asList("<SOLID:123456>Test", "<GRADIENT:2C08BA>Test</GRADIENT:028A97>", "<GRADIENT:123456>******************************************************************************************************************************************************************************************************</GRADIENT:ABCDEF>");
        List<String> result = IridiumColorAPI.process(list);

        assertEquals("§x§1§2§3§4§5§6Test", result.get(0));
        assertEquals("§x§2§c§0§8§b§aT§x§1§e§3§3§a§fe§x§1§0§5§e§a§4s§x§0§2§8§9§9§9t", result.get(1));
        assertEquals("§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*§x§1§2§3§4§5§6*", result.get(2));
    }

    @Test
    void color() {
        assertEquals("§x§0§0§0§0§f§fTest", IridiumColorAPI.color("Test", Color.BLUE));
        assertEquals("§x§f§f§f§f§0§0Test", IridiumColorAPI.color("Test", Color.YELLOW));
        assertEquals("§x§0§0§0§0§0§0Test", IridiumColorAPI.color("Test", Color.BLACK));
    }

    @Test
    void rainbow() {
        assertEquals("§x§f§f§0§0§0§0T§x§8§0§f§f§0§0e§x§0§0§f§f§f§fs§x§8§0§0§0§f§ft", IridiumColorAPI.rainbow("Test", 1));
        assertEquals("§x§f§f§f§f§a§dT§x§f§f§f§e§a§de§x§e§f§f§f§9§cs§x§7§f§e§f§9§ct", IridiumColorAPI.rainbow("Test", 100));
        assertEquals("§x§0§0§0§0§0§0T§x§0§0§0§0§0§0e§x§0§0§0§0§0§0s§x§0§0§0§0§0§0t", IridiumColorAPI.rainbow("Test", 0));
        assertEquals("§x§f§f§f§f§a§d*§x§d§f§7§f§a§d*§x§f§d§f§f§a§d*§x§d§d§7§f§a§d*§x§f§d§f§f§a§d*§x§d§d§7§f§a§d*§x§f§d§7§f§a§d*§x§d§f§f§f§a§d*§x§f§f§7§f§a§d*§x§d§f§f§f§a§d*§x§f§f§7§f§a§d*§x§d§d§f§f§a§d*§x§f§d§7§f§a§d*§x§d§d§f§f§a§d*§x§f§d§f§f§a§d*§x§d§d§7§f§a§d*§x§f§f§f§f§a§d*§x§d§f§7§f§a§d*§x§f§f§f§f§a§d*§x§d§f§7§f§a§d*§x§f§d§f§f§a§d*§x§d§d§7§f§a§d*§x§f§d§7§f§a§d*§x§d§d§f§f§a§d*§x§f§d§7§f§a§d*§x§d§f§f§f§a§d*§x§f§f§7§f§a§d*§x§d§f§f§f§a§d*§x§f§f§7§f§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§e§a§d*§x§f§f§f§f§d§d*§x§f§f§d§f§6§d*§x§f§f§b§e§f§d*§x§f§f§9§e§8§d*§x§f§f§f§e§1§d*§x§e§f§d§d§a§d*§x§e§f§b§d§3§d*§x§e§f§9§c§c§d*§x§e§f§f§c§5§d*§x§e§f§d§f§e§d*§x§e§f§b§f§7§d*§x§e§f§9§f§0§d*§x§e§f§f§e§9§d*§x§e§f§d§e§2§d*§x§e§f§b§d§b§d*§x§e§f§9§d§4§d*§x§e§f§f§c§d§d*§x§f§f§d§c§6§d*§x§f§f§b§f§f§d*§x§f§f§9§f§8§d*§x§f§f§f§f§1§d*§x§f§f§d§e§a§d*§x§f§f§b§e§3§d*§x§f§f§9§d§c§d*§x§f§f§f§d§5§d*§x§f§f§d§c§e§d*§x§f§f§b§c§7§d*§x§f§f§9§c§0§d*§x§e§f§f§f§9§c*§x§a§d§6§f§9§c*§x§a§d§7§f§9§c*§x§e§d§e§f§9§c*§x§e§d§7§f§9§c*§x§a§d§e§f§9§c*§x§a§f§7§f§9§c*§x§e§f§e§f§9§c*§x§e§f§7§f§9§c*§x§a§f§e§f§9§c*§x§a§f§f§f§9§c*§x§e§d§6§f§9§c*§x§e§d§f§f§9§c*§x§a§d§6§f§9§c*§x§a§d§f§f§9§c*§x§e§f§6§f§9§c*§x§e§f§f§f§9§c*§x§a§f§6§f§9§c*§x§a§f§7§f§9§c*§x§e§f§e§f§9§c*§x§e§d§7§f§9§c*§x§a§d§e§f§9§c*§x§a§d§7§f§9§c*§x§e§d§e§f§9§c*§x§e§f§7§f§9§c*§x§a§f§e§f§9§c*§x§a§f§f§f§9§c*§x§e§f§6§f§9§c*§x§e§f§f§f§9§c*§x§7§f§e§f§9§c*§x§f§f§e§f§9§c*§x§7§f§e§f§9§c*§x§f§f§e§f§9§c*§x§7§e§e§f§9§c*§x§f§f§e§f§9§c*§x§7§f§e§f§9§c*§x§f§e§e§f§9§c*§x§f§f§e§f§9§c*§x§7§f§e§f§9§c*§x§f§f§e§f§9§c*§x§7§f§e§f§9§c*§x§f§f§e§f§9§c*§x§7§e§e§f§9§c*§x§f§f§e§f§9§c*§x§7§f§e§f§9§c*§x§7§f§e§f§9§c*§x§f§f§e§f§9§c*§x§7§f§e§f§9§c*§x§f§f§e§f§9§c*§x§7§e§e§f§9§c*§x§f§e§e§f§9§c*§x§7§f§e§f§9§c*§x§f§e§e§f§9§c*§x§f§f§e§f§9§c*§x§7§f§e§f§9§c*§x§f§f§e§f§9§c*§x§7§f§e§f§9§c*§x§f§f§e§f§6§d*§x§f§e§a§f§d§e*§x§f§f§a§f§4§d*§x§f§f§e§f§b§d*§x§f§e§f§d§2§d*§x§f§f§b§d§9§d*§x§f§f§b§d§0§d*§x§f§e§f§d§7§d*§x§f§e§f§d§e§c*§x§f§f§b§f§5§e*§x§f§e§b§f§c§d*§x§f§e§f§f§3§e*§x§f§f§f§f§a§d*§x§f§e§b§d§1§d*§x§f§e§b§d§8§d*§x§f§f§f§d§f§d*§x§f§f§f§d§6§e*§x§f§e§b§d§d§e*§x§f§f§b§f§4§d*§x§f§f§f§f§b§d*§x§f§e§f§f§2§d*§x§f§f§b§f§9§d*§x§f§f§b§d§0§d*§x§f§e§f§d§7§d*§x§f§e§f§d§e§c*§x§f§f§b§d§5§e*§x§f§e§b§d§c§c*§x§f§e§f§f§3§e*", IridiumColorAPI.rainbow("**************************************************************************************************************************************************************************", 100));
    }

    @Test
    void stripColorFormatting() {
        assertEquals("Test", IridiumColorAPI.stripColorFormatting("§8Test"));
        assertEquals("Test", IridiumColorAPI.stripColorFormatting("§1T§1e§3s§3t"));
        assertEquals("Test", IridiumColorAPI.stripColorFormatting("&1T§1e&3s§3t"));
        assertEquals("Test", IridiumColorAPI.stripColorFormatting("&1T&1e&3s&3t"));
        assertEquals("**************************************************************************************************************************************************************************", IridiumColorAPI.stripColorFormatting("§f*§7*§f*§7*§f*§7*§d*§f*§d*§f*§d*§f*§d*§f*§f*§7*§f*§7*§f*§7*§f*§7*§d*§f*§d*§f*§d*§f*§d*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§f*§e*§f*§7*§e*§7*§6*§7*§e*§f*§e*§6*§e*§e*§7*§c*§f*§e*§f*§7*§e*§f*§6*§d*§e*§f*§e*§6*§e*§7*§7*§e*§7*§7*§7*§e*§7*§7*§7*§c*§e*§7*§7*§c*§e*§7*§7*§e*§7*§7*§7*§e*§7*§7*§7*§c*§e*§7*§e*§7*§e*§7*§e*§7*§e*§e*§7*§e*§7*§e*§7*§e*§7*§7*§e*§7*§e*§7*§e*§7*§e*§e*§7*§e*§7*§e*§f*§6*§f*§e*§7*§6*§e*§f*§e*§f*§e*§f*§6*§e*§f*§e*§f*§e*§f*§e*§7*§6*§e*§f*§e*§f*§e*"));
        assertEquals("Test", IridiumColorAPI.stripColorFormatting("<SOLID:123456>Test"));
        assertEquals("Test", IridiumColorAPI.stripColorFormatting("<GRADIENT:2C08BA>Test</GRADIENT:028A97>"));
        assertEquals("Test", IridiumColorAPI.stripColorFormatting("<RAINBOW1>Test</RAINBOW>"));
        assertEquals("Test", IridiumColorAPI.stripColorFormatting("<RAINBOW100>Test</RAINBOW>"));

        assertEquals("<player>", IridiumColorAPI.stripColorFormatting("<player>"));
        assertEquals("<html>Test</html>", IridiumColorAPI.stripColorFormatting("<html>Test</html>"));
        assertEquals("<windows>Test</tests100>", IridiumColorAPI.stripColorFormatting("<windows>Test</tests100>"));
        assertEquals("&&&&&Test&&&&&", IridiumColorAPI.stripColorFormatting("&&&&&Test&&&&&"));
    }

    @AfterAll
    static void tearDown() {
        mockedStatic.close();
    }

}
